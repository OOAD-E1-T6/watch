package watch;

public class AlarmTime {
    private int hour = 0;
    private int min = 0;

    public AlarmTime(int h, int m) {
        this.hour = h;
        this.min = m;
    }

    public int getHour() {
        return this.hour;
    }
    
    public int getMin() {
        return this.min;
    }

    public void setHour(int h) {
        this.hour = h % 24;
    }
    
    public void setMin(int m) {
        this.min = m % 60;
    }

    public void increaseHour() {
        this.hour = (this.hour+1) % 24;
    }

    public void increaseMin() {
        this.min = (this.min+1) % 60;
    }
}
