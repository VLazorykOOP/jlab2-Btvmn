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

    public int differenceInSeconds(Time otherTime) {
        return Math.abs(this.toSeconds() - otherTime.toSeconds());
    }

    public void addSeconds(int seconds) {
        int totalSeconds = this.toSeconds() + seconds;
        setTime((short) (totalSeconds / 3600), (short) ((totalSeconds % 3600) / 60), (short) (totalSeconds % 60));
    }

    public void subtractSeconds(int seconds) {
        int totalSeconds = this.toSeconds() - seconds;
        setTime((short) (totalSeconds / 3600), (short) ((totalSeconds % 3600) / 60), (short) (totalSeconds % 60));
    }

    public int compareTo(Time otherTime) {
        return Integer.compare(this.toSeconds(), otherTime.toSeconds());
    }

    public int toSeconds() {
        return hour * 3600 + minute * 60 + second;
    }

    public int toMinutes() {
        return Math.round(toSeconds() / 60f);
    }

    private void setTime(short hour, short minute, short second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }
}