package restfulBooker;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.json.*;

import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import utils.JsonUtils;


public class TestPostAPI {
	
	@Test
	public void testPostRequestWithHashmap()
	{
		Map<String,Object> requestPayload = new HashMap<>();
		
		 requestPayload.put("firstname","Mariya");
		 requestPayload.put("lastname","Thomas");
		 requestPayload.put("totalprice",222);
		 requestPayload.put("depositpaid",true);
		 requestPayload.put("additionalneeds","Breakfast");
		 
		 Map<String,Object> bookingDates= new HashMap<>();
		 bookingDates.put("checkin","2018-01-01");
		 bookingDates.put("checkout","2019-01-01");
		   
		 requestPayload.put("bookingdates",bookingDates); 
		
		
		Response response = given().baseUri("https://restful-booker.herokuapp.com/").basePath("booking").
		header("Content-Type","application/json").header("Accept","application/json").body(requestPayload).log().all().
		when().post();
	
		int bookingid = response.jsonPath().getInt("bookingid");
		System.out.println("booking id = "+bookingid);
		
		String firstname = response.jsonPath().getString("booking.firstname");
		Assert.assertEquals(firstname,requestPayload.get("firstname"));
				
		//then().log().all().statusCode(200).body("booking.firstname",equalTo( "Jim"));
	}
	
	
	@Test
	public void testPostRequestWithExternalFile() throws FileNotFoundException
	{
		
		File f = new File(".\\body.json");
		FileReader fr = new FileReader(f);
		
		JSONTokener jt = new JSONTokener(fr);
		JSONObject data = new JSONObject(jt);
		
	    given().baseUri("https://restful-booker.herokuapp.com/").basePath("booking").
		header("Content-Type","application/json").header("Accept","application/json").body(data.toString()).log().all().
		when().post().
		then().log().all();
	}
		
		
	
	@Test
	public void testPostRequestWithExternalFileUtils()
	{
		//String filepath = "C:/Users/johng/eclipse-workspace/FirstJavaProject/eclipseNew/APIAutomation/body.json";
		
		String filepath = "src/test/resources/data/bookingRequest.json";
		Map<String,Object> requestPayload= null;
		
		try
		{
		requestPayload =JsonUtils.getJsonDataFromFile(filepath);
		} catch(IOException e)
		{
		e.printStackTrace();
		}
		
		Response response = given().baseUri("https://restful-booker.herokuapp.com/").basePath("booking").
		header("Content-Type","application/json").header("Accept","application/json").body(requestPayload).log().all().
		when().post();
	
		int bookingid = response.jsonPath().getInt("bookingid");
		System.out.println("booking id = "+bookingid);
		
		String firstname = response.jsonPath().getString("booking.firstname");
		Assert.assertEquals(firstname,requestPayload.get("firstname"));
				
		//then().log().all().statusCode(200).body("booking.firstname",equalTo("Jim"));
	  }
	
	
	@Test
	public void testSchema()
	{
		Map<String,Object> requestPayload = new HashMap<>();
		
		 requestPayload.put("firstname","Aneena");
		 requestPayload.put("lastname","Brown");
		 requestPayload.put("totalprice",111);
		 requestPayload.put("depositpaid",true);
		 requestPayload.put("additionalneeds","Breakfast");
		 
		 Map<String,Object> bookingDates= new HashMap<>();
		 bookingDates.put("checkin","2018-01-01");
		 bookingDates.put("checkout","2019-01-01");
		   
		 requestPayload.put("bookingdates",bookingDates); 
		 
		File file = new File("src/test/resources/Schema/createBookingResponseSchema.json");
		
		given().baseUri("https://restful-booker.herokuapp.com/").basePath("booking").
		header("Content-Type","application/json").header("Accept","application/json").body(requestPayload).log().all().
		when().post().
				
		then().log().all().body(JsonSchemaValidator.matchesJsonSchema(file));
	}
	
	
	
}


