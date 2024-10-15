package restfulBooker;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class RestfulBooker {
	
    @Test
	 public void testGetMethodBooking()
	 {
		 given().baseUri("https://restful-booker.herokuapp.com/booking").log().all().
		 when().get().
		 then().log().all().statusCode(200);
	 }
	
	@Test
	public void testGetBooking()
	  {
		//baseURI = " https://restful-booker.herokuapp.com";
		
		given().baseUri("https://restful-booker.herokuapp.com/").basePath("booking").log().all().
		when().get().
		then().log().all().statusCode(200).body("[1].bookingid", equalTo(1420));
		
	   }
	
	@Test
	public void testGetBookingwithQueryParam() 
	{
		given().baseUri("https://restful-booker.herokuapp.com/").basePath("booking").param("firstName", "Jim").param("lastname", "Brown").
		log().all().
		when().get().
		then().log().all().statusCode(200);
	}
	
	@Test
	public void testGetBookingwithQueryCheckInOutParam()      
	{
		given().baseUri("https://restful-booker.herokuapp.com/").basePath("booking").param("checkin", "2018-01-01").param("checkout", "2019-01-01").
		log().all().
		when().get().
		then().log().all().statusCode(200);
	}
	
	@Test
	public void testGetBookingDetailforBookingId()
	{
		given().baseUri("https://restful-booker.herokuapp.com/").basePath("booking/{bookingid}").pathParam("bookingid",370).
		log().all().
		when().get().
		then().log().all().statusCode(200).body("lastname", equalTo("Smith")).body("firstname", startsWith("J")).body("totalprice", greaterThan(100))
		.body("bookingdates.checkin", equalTo("2018-01-01"));
	}
	
	
	@Test
	public void assertGetBookingIDDetails()
	{
		
		Response response = given().baseUri("https://restful-booker.herokuapp.com/").basePath("booking/{bookingid}").pathParam("bookingid", 446).
							log().all().when().get();
		
		System.out.println(response.asPrettyString());
		
		String fname = response.jsonPath().getString("firstname");
		Assert.assertEquals(fname, "Josh");
		
		String lastName = response.jsonPath().getString("lastname");
		Assert.assertEquals(lastName,"Allen");
		
		
		String depositPaidOrNot = response.jsonPath().getString("depositpaid");
		Assert.assertEquals(depositPaidOrNot,"true");
	}
	
	
	@Test
	public void testCreateBooking()
	{
		
		String request = "{\r\n"
				+ "  \"firstname\": \"Aneena\",\r\n"
				+ "  \"lastname\": \"Vincent\",\r\n"
				+ "  \"totalprice\": 121,\r\n"
				+ "  \"depositpaid\": false,\r\n"
				+ "  \"bookingdates\": {\r\n"
				+ "    \"checkin\": \"2024-01-01\",\r\n"
				+ "    \"checkout\": \"2025-01-01\"\r\n"
				+ "  },\r\n"
				+ "  \"additionalneeds\": {\r\n"
				+ "    \"Food\": \"Lunch\"\r\n"
				+ "  },\r\n"
				+ "  \"array\": [\r\n"
				+ "    1,\r\n"
				+ "    2,\r\n"
				+ "    3\r\n"
				+ "  ],\r\n"
				+ "  \"stringArray\": [\r\n"
				+ "    \"abc\",\r\n"
				+ "    \"def\",\r\n"
				+ "    \"hij\"\r\n"
				+ "  ]\r\n"
				+ "}";
				
		given().baseUri("https://restful-booker.herokuapp.com/").basePath("booking").header("Content-Type","application/json").header("Accept","application/json").
		body(request).
		log().all().
		when().post().
		then().log().all().statusCode(200).body("booking.firstname",equalTo( "Aneena"));
	}
	
	
	@Test
	public void testPutUpdateBooking()
	{
		String requestToUpdate = "{\r\n"
				+ "    \"firstname\" : \"james\",\r\n"
				+ "    \"lastname\" : \"Dzuza\",\r\n"
				+ "    \"totalprice\" : 222,\r\n"
				+ "    \"depositpaid\" : true,\r\n"
				+ "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2018-01-01\",\r\n"
				+ "        \"checkout\" : \"2019-01-01\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
				+ "}";
		
		given().baseUri("https://restful-booker.herokuapp.com/").basePath("booking/442").
		header("Content-Type","application/json").header("Accept","application/json").header("Cookie","token=1566619bbc07408").
		log().all().body(requestToUpdate).
		when().put().
		then().log().all().statusCode(200);
	}  
	
	
	@Test
	public void testPatchUpdateBooking()
	{
		String requestToPartialUpdate = "{\r\n"
				+ "    \"firstname\" : \"Rocky\",\r\n"
				+ "    \"lastname\" : \"Bhai\"\r\n"
				+ "}";
		
		given().baseUri("https://restful-booker.herokuapp.com/").basePath("booking/2418").
		header("Content-Type","application/json").header("Accept","application/json").header("Cookie","token=9f0d7919d339571").
		log().all().body(requestToPartialUpdate).
		when().patch().
		then().log().all().statusCode(200);
	} 
	
}


