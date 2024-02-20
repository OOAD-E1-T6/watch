package watch;
import static org.junit.jupiter.api.Assertions.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

enum WatchMode {
    TimeKeeping, StopWatch, Alarm, Timer;

    private static final WatchMode[] vals = values();
    
    public WatchMode next() {
        return vals[(this.ordinal() + 1) % vals.length];
    }
}


public class CheckSelectedAlarmTimeTest {
    public WatchController controller = new WatchController();

    @Given("현재 모드는 {WatchMode} 이다")
    public void setMode(WatchMode watchMode) {
        controller.setMode(1);
    }

    @Given("현재 설정된 알람 시간은 {int}시 {int}분 이다.") 
    public void setSelectedAlarm(int h, int m) {
        controller.setAlarmTime(h,m);
    }

    @When("사용자는 C 버튼을 누른다.")
    public void PressButtonC(String key) {
        controller.changeMode();
    }

    @Then("현재 알람시간을 표시한다({int}시 {int}분)")
    public void getSelectedAlarmTime(int resultHour, int resultMin) {
        AlarmTime time = controller.getAlarmTime();
        assertTrue(time.getHour() == resultHour);
        assertTrue(time.getMin() == resultMin);
    }
}
