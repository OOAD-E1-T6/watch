package watch;

import static org.junit.jupiter.api.Assertions.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddNewAlarmTest {
    public WatchController controller = new WatchController();

    @Given("현재 모드는 알람모드 이다.")
    public void setAlramMode() {
        controller.setMode(2);
    }

    @When("사용자는 B 버튼을 길게 눌러 addAlarm을 실행한다") 
    public void pressButtonBLongPress(int h, int m) {
        boolean result = controller.pressButton("B",true);
        assertTrue(result);
    }

    @When("사용자는 {String} 버튼을 {int}회 눌러 3시로 설정한다.")
    public void PressButtonDButton3Times(String key, int times) {
        for (int i = 0 ; i < times ; i++) {
            controller.pressButton(key, false);
        }
    }

    @When("사용자는 C 버튼을 눌러 min 설정으로 커서를 옮긴다.")
    public void PressButtonC() {
        controller.pressButton("C", false);
    }

    @When("사용자는 {String} 버튼을 {int}회 눌러 min을 23분으로 설정한다.")
    public void PressButtonDButton23Times(String key, int times) {
        for (int i = 0 ; i < times ; i++) {
            controller.pressButton( key , false);
        }
    }

    @When("사용자는 A 버튼을 눌러 Alarm 추가를 완료한다.")
    public void PressButtonA() {
        controller.pressButton("A", false);
    }

    @Then("현재 알람시간을 표시한다({int}시 {int}분)")
    public void getSelectedAlarmTime(int resultHour, int resultMin) {
        AlarmTime time = controller.getAlarmTime();
        assertTrue(time.getHour() == resultHour);
        assertTrue(time.getMin() == resultMin);
    }
    
}
