package watch;

enum ThermometerState {
    NORMAL, ADD
}

public class Thermometer {
    private ThermometerState state = ThermometerState.NORMAL;
    private int temperatureAlarm = 0;
    private boolean isOn = false;

    public boolean enterTempSettingMode() {
        if (this.temperatureAlarm == 0) {
            this.temperatureAlarm = 33;
        }
        this.state = ThermometerState.ADD;
        return true;
    }
    public void increaseTemp() {
        int min = 33;
        int max = 44;
        int temp = this.temperatureAlarm + 1;

        if (temp > max) {
            this.temperatureAlarm = min;
        } else {
            this.temperatureAlarm = temp;
        } 
    }

    public void decreaseTemp() {
        int min = 33;
        int max = 44;
        int temp = this.temperatureAlarm - 1;

        if (temp < min) {
            this.temperatureAlarm = max;
        } else {
            this.temperatureAlarm = temp;
        } 
    }

    public void exitTempSettingMode() {
        this.state = ThermometerState.NORMAL;
        this.isOn = true;
    }

    public int getTemp() {
        return this.temperatureAlarm;
    }

}
