package watch;

import static org.junit.jupiter.api.Assertions.*;

import io.cucumber.java.en.*;

public class TimekeepingToggleTimeFormatTest {
    Timekeeping timekeeping = new Timekeeping();
    boolean mode1;
    boolean mode2;

    @Given("User press the button {int}")
    public void User_press_the_button(int key) {
        mode1 = timekeeping.toggleTimeFormat();
    }
    @Then("the time format should toggle between 12H and 24H")
    public void the_time_format_should_toggle_between_12H_and_24H() {
        mode2 = timekeeping.toggleTimeFormat();
        assertNotEquals(mode1, mode2);
    }
}
