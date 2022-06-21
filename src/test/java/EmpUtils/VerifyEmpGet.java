package EmpUtils;

import Sprint.Employee;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class VerifyEmpGet {
	@Given("Get all the details of Emp")
	public void get_all_the_details_of_emp() {
	    Employee obj3=new Employee();
	    obj3.getMethod();
	}

	@Then("EmpGet executed sucessfully")
	public void emp_get_executed_sucessfully() {
	    System.out.println("Emp get executed succesfully");
	}

}
