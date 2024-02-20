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

    public boolean pressButton(String key, boolean isLongPress) {
        switch (this.mode) {
            case 0:
                return false;
            case 1:
                return false;
            case 2:
                switch(key) {
                    case "A":
                        this.alarmManager.savedAlarm();
                        break;
                    case "B":
                        if (isLongPress) {
                            return this.alarmManager.addAlarm();
                        }
                        break;
                    case "C":
                        this.alarmManager.selectedUnitForSetting();
                        break;
                    case "D":
                        this.alarmManager.increaseTime();
                        break;
                    default:
                        break;

                }
                return false;
            case 3:
                return false;
            default:
                return false;
        }
    }

    public void enterTimeSettingMode() {
    }

    public void toggleTimeFormat() {
    }
}