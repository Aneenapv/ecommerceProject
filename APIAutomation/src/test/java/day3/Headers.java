package day3;

import org.testng.annotations.Test;
import io.restassured.http.*;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;



public class Headers {
	
	
	@Test(priority=1)
	void HeadersInfo()
	{
		given()
		
		.when()
		.get("https://www.google.com/")
		
		.then()
		.header("Content-Type", "text/html; charset=ISO-8859-1")
		.and()
		.header("Content-Encoding","gzip")
		.header("Server","gws")
				
		.statusCode(200).log().all();
		
		//log().body()
		//log().headers()
		//log().cookies()
		
		
	}
	
	@Test(priority=2)
	void HeadersResponse()
	{
		Response res = given()
		
		.when()
		.get("https://www.google.com/");
		
		
		// get single header info
		//String single_header = res.getHeader("Content-Type");
		//System.out.println("sinle header value = "+single_header);
		
		
		// get all the headers
		
          io.restassured.http.Headers headers_values = res.getHeaders();
		
		for(Header allHeaders: headers_values)
		{
			System.out.println("All headers  = "+ allHeaders.getValue());
		}
		
		
		
	/*	.then()
		.header("Content-Type", "text/html; charset=ISO-8859-1")
		.and()
		.header("Content-Encoding","gzip")
		.header("Server","gws")
				
		.statusCode(200).log().all(); 
		
		 */
	}
	
	

}
