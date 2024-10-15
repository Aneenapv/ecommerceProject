package restfulBooker;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.util.Base64;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import utils.SpotifyPropertyUtil;

public class SpotifyAPITesting {
	
	String accessToken=null;
	
	@BeforeClass
	public String generateToken()
	{
		Response response =  given().baseUri("https://accounts.spotify.com/api/token").
		header("Content-Type","application/x-www-form-urlencoded").
		header("Authorization","Basic "+generateEncodeCredentials()).
	    formParam("grant_type","client_credentials").log().all().
	    
	    when().post();
		System.out.println(response.asPrettyString());
		accessToken = response.jsonPath().getString("access_token");
		return accessToken;
	}

	


	public static String generateEncodeCredentials()
	{
		String creds = SpotifyPropertyUtil.getProperty("src/test/resources/config.properties","client_id") + ":" 
	                 + SpotifyPropertyUtil.getProperty("src/test/resources/config.properties","client_secret");
		
		creds = Base64.getEncoder().encodeToString(creds.getBytes());
		System.out.println("Encoded creds: "+creds);
		return creds;
	}
	
	@Test
	public void testSpotifyAPI()
	{
		//System.out.println(generateToken());
		
		 //String token = generateToken();
		 //System.out.println(token);
		
		System.out.println("token token token: " +accessToken);
		
		File file = new File("src/test/resources/Schema/spotifyGetAlbumSchema.json");
		
		 given().baseUri("https://api.spotify.com").basePath("v1/albums/{id}").pathParam("id","4aawyAB9vmqN3uQ7FjRGTy"). 
		 header("Authorization","Bearer "+accessToken).log().all().when().get().
		 then().log().all().statusCode(200).body(JsonSchemaValidator.matchesJsonSchema(file));
		 
	}
}
