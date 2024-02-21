package watch;

enum WatchMode {
    TIME_KEEPER, STOP_WATCH, ALARM, TIMER, TEMPERATURE
}

public class WatchController {
    private WatchMode mode = WatchMode.TIME_KEEPER;
    private Alarm alarmManager = new Alarm();
    private Thermometer temperatureManager = new Thermometer();

    public void changeMode() {
        switch (this.mode) {
            case TIME_KEEPER:
                this.mode = WatchMode.STOP_WATCH;
                break;
            case STOP_WATCH:
                this.mode = WatchMode.ALARM;
                break;
            case ALARM:
                this.mode = WatchMode.TIMER;
                break;
            case TIMER:
                this.mode = WatchMode.TEMPERATURE;
                break;
            case TEMPERATURE:
                this.mode = WatchMode.TIME_KEEPER;
                break;
            default:
            break;
        }
    }

    public void setMode(WatchMode m) {
        this.mode = m;
    }

    public AlarmTime getAlarmTime() {
        return this.alarmManager.getSelectedAlarmTime();
    }

    public void setAlarmTime(int h, int m) {
        this.alarmManager.setSelectedAlarm(h, m);
    }

    public int getAlarmTemperature() {
        return this.temperatureManager.getTemp();
    }

    public boolean pressButton(String key, boolean isLongPress) {
        switch (this.mode) {
            case TIME_KEEPER:
                return false;
            case STOP_WATCH:
                return false;
            case ALARM:
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
            case TIMER:
                return false;
            case TEMPERATURE:
                switch(key) {
                    case "A":
                        this.temperatureManager.exitTempSettingMode();
                        break;
                    case "B":
                        if (isLongPress) {
                            return this.temperatureManager.enterTempSettingMode();
                        } else {
                            this.temperatureManager.increaseTemp();;
                        }
                        break;
                    case "C":
                        break;
                    case "D":
                        this.temperatureManager.decreaseTemp();
                        break;
                    default:
                        break;

                }
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