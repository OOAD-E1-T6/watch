package watch;

import static org.junit.jupiter.api.Assertions.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SetTemperatureAlarmTest {
    public WatchController controller = new WatchController();
    
    // Scenario: User set temperature alarm

    @Given("현재 모드는 온도모드 이다.")
    public void setTemeratureMode() {
        controller.setMode(WatchMode.TEMPERATURE);
    }

    @When("사용자는 {String} 버튼을 길게 눌러 TempSetting 모드를 실행한다.") 
    public void pressButtonBLongPressToAddTemp(String key, int m) {
        boolean result = controller.pressButton(key, true);
        assertTrue(result);
    }

    @When("사용자는 {String} 버튼을 {int}회 눌러 40도로 설정한다.")
    public void PressButtonBButton7TimesToSetTemp(String key, int times) {
        for (int i = 0 ; i < times ; i++) {
            controller.pressButton(key, false);
        }
    }

    @When("사용자는 A 버튼을 눌러 온도 알람 설정을 완료한다.")
    public void PressButtonAToSaveTemperatureAlarm() {
        controller.pressButton("A", false);
    }

    @Then("현재 온도알람을 표시한다({int}도})")
    public void getTemperatrueAlarm(int resultTemperature) {
        int temperature = controller.getAlarmTemperature();
        assertTrue(temperature == resultTemperature);
    }

}
