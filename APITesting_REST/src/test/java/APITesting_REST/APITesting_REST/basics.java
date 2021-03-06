package APITesting_REST.APITesting_REST;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.HashMap;

import Files.payload;
import Files.reUsableMethods;
public class basics {

	public static void main(String[] args) {
		
		//validate ADD PLACE API
		//Add Place-->update address-->get place and validate new address
		
		//GIVEN- all inputs
		//when-SUbmit API- resource & HTTP methods
		//Then-validate the response
		RestAssured.baseURI="https://rahulshettyacademy.com";
		String response=given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(payload.addPlace()).when().post("maps/api/place/add/json")
		.then().assertThat().statusCode(200).body("scope",equalTo("APP"))
		.header("Server", "Apache/2.4.18 (Ubuntu)").extract().response().asString();		
		
		
		System.out.println(response );
		
		JsonPath js = new JsonPath(response); //for parsing JSON
		String placeid=js.getString("place_id");
		
		System.out.println(placeid);
		
		//update place
		
		String newaaddress="70 Summer walk, USA";
		
		given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body("{\r\n" + 
				"\"place_id\":\""+placeid+"\",\r\n" + 
				"\"address\":\""+newaaddress+"\",\r\n" + 
				"\"key\":\"qaclick123\"\r\n" + 
				"}")
		
		.when().put("maps/api/place/update/json")
		.then().assertThat().log().all().statusCode(200).body("msg", equalTo("Address successfully updated"));
		
		//Get Place
		String get_response=given().log().all().queryParam("key", "qaclick123")
		.queryParam("place_id", placeid)
		
		.when().get("maps/api/place/get/json")
		.then().assertThat().log().all().statusCode(200).extract().response().asString();
		
		JsonPath js1= reUsableMethods.rowToJason(get_response);
		
		String actualaddress=js1.getString("address");
		
		Assert.assertEquals(actualaddress, get_response);
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		
		
		
		
		

		
	}

} 
