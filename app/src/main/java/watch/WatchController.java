package watch;

public class WatchController {
    private int mode = 0;
    private Alarm alarmManager = new Alarm();

    public void changeMode() {
        this.mode = (this.mode + 1) % 4;
    }

    public void setMode(int m) {
        this.mode = m % 4;
    }

    public AlarmTime getAlarmTime() {
        return this.alarmManager.getSelectedAlarmTime();
    }

    public void setAlarmTime(int h, int m) {
        this.alarmManager.setSelectedAlarm(h, m);
    }

    public void enterTimeSettingMode() {
    }

    public void toggleTimeFormat() {
    }
}