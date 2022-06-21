package EmpUtils;

import java.io.FileNotFoundException;

import Sprint.Employee;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class VerifyEmpCreate {
	@Given("Create new booking id")
	public void create_new_booking_id() throws FileNotFoundException {
	    Employee obj=new Employee();
	    obj.postMethod();
	}

	@Then("EmpCreate executed sucessfully")
	public void emp_create_executed_sucessfully() {
	   System.out.println("Employee created succesfully");
	}

}
