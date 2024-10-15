package day3;


import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;

public class Cookies {
	
	@Test(priority=1)
	void cookiesAndHeaders()
	{
		given()
		
		.when().get("https://www.google.com/")
		
		.then()
		//.cookie("AEC","AVYB7cqy9D2jETz6wzGtWwy1-t9LNYvyRrpfNXUiLYxHJZkz_-4yDWrA7U4")
		.statusCode(200).log().all();
	}
	
	
	@Test(priority=2)
	void cookiesInfo()
	{
		Response res = given()
		
		.when().get("https://www.google.com/");
		
		// to get single cookie information
		//String cookie_value = res.getCookie("AEC");
		//System.out.println("value of cookie = "+cookie_value);
		
		
		//to get all the cookies information
		Map<String, String> cookies_values = res.getCookies();
		
		System.out.println(cookies_values.keySet());
		
		for(String listOfKeys: cookies_values.keySet())
		{
			String cookie_value = res.getCookie(listOfKeys);
			
			System.out.println("All cookies  = "+cookie_value);
		}
		
	
	}
	
	
	
	

}
