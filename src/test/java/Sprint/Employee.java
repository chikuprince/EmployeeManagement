package Sprint;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;

public class Employee {
	
	public void getMethod()
	{
		RestAssured.given().baseUri("http://localhost:8081").when().log().all().get("/employees").then().log().all()
		.assertThat().statusCode(200);
	}
	public void postMethod() throws FileNotFoundException
	{
		RestAssured.given().baseUri("http://localhost:8081")
		.body(getFileContent("C:\\capgemini\\EmployeeManagement\\src\\test\\resources\\CreateEmployee.txt")).header("Accept","application/json")
		.header("content-type","application/json").when().log().all().post("/employee").then().log().all();
	}
	public void putMethod() throws FileNotFoundException
	{
		RestAssured.given().baseUri("http://localhost:8081")
		.body(getFileContent("C:\\capgemini\\EmployeeManagement\\src\\test\\resources\\updateEmployee.txt")).header("Accept","application/json")
		.header("content-type","application/json").header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=").when().log().all().put("/employee/108").then().log().all();
	}
	public void deleteMethod()
	{
		RestAssured.given().baseUri("http://localhost:8081")
		.headers("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=").when().log().all().delete("/employee/108")
		.then().log().all().assertThat().statusCode(204);
	}
	public static String getFileContent(String filePath) throws FileNotFoundException
	{
	    File file = new File(filePath);
	    Scanner sc = new Scanner(file);
	    sc.useDelimiter("\\Z");
	    return sc.next();

	}

}
