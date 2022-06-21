package EmpUtils;

import java.io.FileNotFoundException;

import Sprint.Employee;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class VerifyEmpAll {
	@Given("Calling Get Method")
	public void calling_get_method() {
	    Employee ref1=new Employee();
	    ref1.getMethod();
	}

	@Given("Create post")
	public void create_post() throws FileNotFoundException {
		Employee ref2=new Employee();
	    ref2.postMethod();
	}

	@Given("Update put")
	public void update_put() throws FileNotFoundException {
		Employee ref3=new Employee();
	    ref3.putMethod();
	}

	@Given("Remove Delete")
	public void remove_delete() {
		Employee ref4=new Employee();
	    ref4.deleteMethod();
	}

	@Then("executed succesfully")
	public void executed_succesfully() {
	    System.out.println("All methods executed succesfully");
	}

}
