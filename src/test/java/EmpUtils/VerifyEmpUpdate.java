package EmpUtils;

import java.io.FileNotFoundException;

import Sprint.Employee;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class VerifyEmpUpdate {
	@Given("Update Emp data")
	public void update_emp_data() throws FileNotFoundException {
	    Employee obj2=new Employee();
	    obj2.putMethod();
	}

	@Then("EmpUpdate executed sucessfully")
	public void emp_update_executed_sucessfully() {
	    System.out.println("put method executed succesfully");
	}

}
