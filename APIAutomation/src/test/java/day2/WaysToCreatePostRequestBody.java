package day2;


import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;


public class WaysToCreatePostRequestBody {
	
	String id;
	
	/* @Test(priority=1)
	void createUserUsingHashMap()
	{
		HashMap hm = new HashMap();
		hm.put("name","Izza Ann");
		hm.put("place", "Canada");
		hm.put("grade", "First Class");
		
	    id = given().contentType("application/json").body(hm)
		
		.when()
		.post("http://localhost:3000/students")
		.jsonPath().getString("id");
		
	 /* .then().statusCode(201)
		.body("name",equalTo("Izza Ann"))
		.body("place", equalTo("Canada"))
		.body("grade", equalTo("First Class"))
		.header("Content-Type","application/json")
		.log().all();  */ 
      //}
	
	/*
	@Test(priority=2)
	void deleteUserUsingHashMap()
	{
		given()
		
		.when().delete("http://localhost:3000/students/"+id)
		
		.then().statusCode(200).log().all();
	}  
	
	*/
	
	
/*	@Test(priority=3)
	void createUserUsingOrgJson()
	{
		JSONObject data  = new JSONObject();
		data.put("name","Sheela");
	    data.put("place", "India");
		data.put("grade", "First");
		
		
	   id= given()
	    .contentType("application/json")
	    .body(data.toString())
		
		.when()
		.post("http://localhost:3000/students")
		.jsonPath().getString("id");
		
		
	   /*.then().statusCode(201)
		.body("name",equalTo("Sheela"))
		.body("place", equalTo("India"))
		.body("grade", equalTo("First"))
		.header("Content-Type","application/json")
		.log().all();   */
	//}
	
/*	@Test(priority=4)
	void deleteUserUsingOrgJson()
	{
		given()
		
		.when().delete("http://localhost:3000/students/"+id)
		
		.then().statusCode(200).log().all();
	}   */
	
	
	
	//3. using POJO Class
	/*
	@Test(priority=5)
	void createUserUsingPOJO()
	{
		POJO_PostRequest data = new POJO_PostRequest();
		data.setName("George");
		data.setPlace("Gujarat");
		data.setGrade("Second");
		
		
	   id= given()
	    .contentType("application/json")
	    .body(data)
		
		.when()
		.post("http://localhost:3000/students")
		.jsonPath().getString("id");
		
		
	   /*.then().statusCode(201)
		.body("name",equalTo("George"))
		.body("place", equalTo("Gujarat"))
		.body("grade", equalTo("Second"))
		.header("Content-Type","application/json")
		.log().all();   */
	//}
	
	/*@Test(priority=6)
	void deleteUserUsingPOJO()
	{
		given()
		
		.when().delete("http://localhost:3000/students/"+id)
		
		.then().statusCode(200).log().all();
		
	}  
	
	*/
	
	
	//4. using external json file
	
	
		@Test(priority=7)
		void createUserUsingExternalJson() throws FileNotFoundException
		{
			File f = new File(".\\body.json");
			FileReader fr = new FileReader(f);
			JSONTokener jt = new JSONTokener(fr);
			
			JSONObject data = new JSONObject(jt);
		
			
		    id = given()
		    .contentType("application/json")
		    .body(data.toString())
			
			.when()
			.post("http://localhost:3000/students")
			.jsonPath().getString("id");
			
			
		  /* .then().statusCode(201)
			.body("firstname",equalTo("Jim"))
			.body("lastname", equalTo("Brown"))

			.header("Content-Type","application/json")
			.log().all();  */
		}
		
		@Test(priority=8)
		void deleteUserUsingExternalJson()
		{
			given()
			
			.when().delete("http://localhost:3000/students/"+id)
			
			.then().statusCode(200).log().all();
			
		}  
		
	
	
}
