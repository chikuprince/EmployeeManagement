package sprint2;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import Sprint.Employee;

public class EmployeeTest extends Employee{
	
	@Test
	public void TestGetMethod()
	{
		Employee obj = new Employee();
		obj.getMethod();
	}
	
	@Test(priority=1)
	public void TestPostMethod() throws FileNotFoundException
	{
		Employee obj1 = new Employee();
		obj1.postMethod();
	}
	
	@Test(priority=2)
	public void TestPutMethod() throws FileNotFoundException
	{
		Employee obj2 = new Employee();
		obj2.putMethod();
	}
	@Test(enabled=true)
	public void TestDeleteMethod()
	{
		Employee obj3 = new Employee();
		obj3.deleteMethod();
	}

}
