package restAssuredPackage;


import static io.restassured.RestAssured.*;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import org.junit.Test;

public class Demo1 {
	
	
	@Test
	public void sampleGetCall() {
		
		given()
		.when()
		.get("https://reqres.in/api/users?page=2")
		.then()
		.assertThat().body(matchesJsonSchemaInClasspath("output.json"))
		.log().all();
		
		
	}
}
