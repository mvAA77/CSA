public class Stop {
    
    private Time time;
    private String location;
    private int numStudents;
    
    public Stop() {
        time = new Time();
        location = "MRHS";
        numStudents = 0;
    }
    
    public Stop(Time time, String location, int numStudents) {
        this.time = time;
        this.location = location;
        this.numStudents = numStudents;
    }
    
    public String toString() {
        return location + " at " + time + " with " + numStudents + " students";
    }
}
