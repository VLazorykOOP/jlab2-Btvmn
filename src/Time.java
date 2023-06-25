public class Time {
    private short hour;
    private short minute;
    private short second;

    public Time(short hour, short minute, short second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time(String timeString) {
        String[] parts = timeString.split(":");
        this.hour = Short.parseShort(parts[0]);
        this.minute = Short.parseShort(parts[1]);
        this.second = Short.parseShort(parts[2]);
    }

    public Time(int totalSeconds) {
        this.hour = (short) (totalSeconds / 3600);
        this.minute = (short) ((totalSeconds % 3600) / 60);
        this.second = (short) (totalSeconds % 60);
    }

    public Time(Time otherTime) {
        this.hour = otherTime.hour;
        this.minute = otherTime.minute;
        this.second = otherTime.second;
    }
}