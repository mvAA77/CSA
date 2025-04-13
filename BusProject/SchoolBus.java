public class SchoolBus {
    
    private int busNumber;
    private String driver;
    
    public SchoolBus() {
        busNumber = 000;
        driver = "Driver";
    }
    
    public SchoolBus(int busNumber, String driver) {
        this.busNumber = busNumber;
        this.driver = driver;
    }
    
    public String toString() {
        return "Bus " + busNumber + " , Driver: " + driver;
    }  
}
