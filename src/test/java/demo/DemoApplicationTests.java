package demo;

import static com.jayway.restassured.RestAssured.expect;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jayway.restassured.path.xml.XmlPath;
import com.jayway.restassured.path.xml.XmlPath.CompatibilityMode;
import com.jayway.restassured.response.ResponseBodyExtractionOptions;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoApplication.class)
@WebIntegrationTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {

		ResponseBodyExtractionOptions o = expect()
				.statusCode(200)
				.when()
				.given()
				.formParam("email", "dmcloughlin@gmail.com")
				.formParam("surname", "McLoughlin")
				.post("/users/save").then().extract().body();
		
		XmlPath xmlPath = new XmlPath(CompatibilityMode.HTML, o.htmlPath().getString("html"));
		
		System.out.println(xmlPath.prettyPrint());
	}
}