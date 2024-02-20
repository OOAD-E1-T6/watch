package watch;

import java.util.ArrayList;
import java.util.List;

public class Alarm {
    private AlarmTime selectedAlarm;
    private AlarmTime addingAlarm;
    private List<AlarmTime> savedAlarms = new ArrayList<AlarmTime>();
    private boolean isSelectHour = true;

    public Alarm() {
        this.selectedAlarm = new AlarmTime(0,0);
    }

    public Alarm(int h, int m) {
        this.selectedAlarm = new AlarmTime(h,m);
    }

    public void setSelectedAlarm(int h, int m) {
        this.selectedAlarm = new AlarmTime(h, m);
    }

    public boolean addAlarm() {
        if (savedAlarms.size() > 4) {
            return false;
        }
        this.addingAlarm = new AlarmTime(0, 0);
        this.isSelectHour = true;

        return true;
    }

    public void selectedUnitForSetting() {
        this.isSelectHour = !isSelectHour;
    }

    public void increaseTime() {
        if(isSelectHour) {
            this.addingAlarm.increaseHour();
        } else {
            this.addingAlarm.increaseMin();
        }
    }

    public void savedAlarm() {
        this.savedAlarms.add(addingAlarm);
        this.addingAlarm = new AlarmTime(0, 0);
        this.isSelectHour = true;
    }

    public AlarmTime getSelectedAlarmTime() {
        return this.selectedAlarm;
    }

}
