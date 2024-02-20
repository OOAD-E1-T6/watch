package watch;

import io.cucumber.java.en.*;

public class StepDefinitions {
    @Given("I have {int} cukes in my belly")
    public void I_have_cukes_in_my_belly(int cukes) {
        Timekeeping tk = new Timekeeping();
        tk.toggleTimeFormat();
    }
    @When("I wait {int} minute")
    public void I_wait_minute(int minutes) {
        //throw new io.cucumber.java.PendingException();
    }

    @Then("my belly should growl")
    public void my_belly_should_growl() {
        //throw new io.cucumber.java.PendingException();
    }

}
