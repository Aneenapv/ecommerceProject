package day4;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBodyExtractionOptions;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONArray;
import org.json.JSONObject;

public class ParsingJSONResponseData {

	
	//approach 1
	@Test
	void testJsonResponse1()
	{
		given()
		.contentType("application/json")
		
		.when()
		.get("http://localhost:3000/books")
		
		.then()
		.statusCode(200)
		.header("Content-Type","application/json")
		.body("[2].title",equalTo("The Great Gatsby"))
		.log().all();
	}
	
	// approach 2
	@Test
	void testJsonResponse2()
	{
		Response res  = given()
		.contentType("application/json")
		
		.when()
		.get("http://localhost:3000/books");
		
		
		Assert.assertEquals(res.getStatusCode(), 200);    //validation 1
		Assert.assertEquals(res.header("Content-Type"),"application/json"); 
		
		String bookName = res.jsonPath().get("[2].title").toString();
		Assert.assertEquals(bookName,"The Great Gatsby");
		
	}
	
	
	// approach 3  //not working
	@Test
	void testJsonResponse3()
	{
		Response res  = given()
		.contentType(ContentType.JSON)
		
		.when()
		.get("http://localhost:3000/books");
		
		//JSONObject class
		JSONObject jo = new JSONObject(res.asString()); 
		
		
        for (int i = 0; i < jo.length(); i++)
		{
         String bookName = jo.getJSONObject("title").toString();
			System.out.println("book names : "+bookName);

		}
		
	}
	
}
