package watch;

import java.time.LocalDateTime;

public class Timekeeping {
    private LocalDateTime time;
    private boolean is24HourFormat = false;

    public LocalDateTime getCurrentTime() {
        return time;
    }

    public void enterTimeSettingMode() {
    }

    public boolean toggleTimeFormat() {
        is24HourFormat = !is24HourFormat;
        return is24HourFormat;
    }

    public void selectUnitForSetting() {
    }

    public void increaseTime() {
    }

    public void decreaseTime() {
    }

    public boolean isAllUnitSetted() {
        return true;
    }
}