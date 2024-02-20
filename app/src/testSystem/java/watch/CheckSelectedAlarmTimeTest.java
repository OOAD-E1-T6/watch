package watch;
import static org.junit.jupiter.api.Assertions.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

enum WatchMode {
    TimeKeeping, StopWatch, Alarm, Timer
}


public class CheckSelectedAlarmTimeTest {
    public WatchMode mode = WatchMode.TimeKeeping;

    @Given("현재 모드는 {WatchMode} 이다")
    public void setMode(WatchMode watchMode) {
        this.mode = watchMode;
    }

    @when("사용자는 {String} 버튼을 누른다.")
    public void keyPress(String key) {
        switch (key) {
            case "A":
            break;

            case "B":
            break;

            case "C":
            break;

            case "D":
            break;
            default:
            break;
        }
    }
}
