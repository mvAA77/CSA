public class ARLBus extends SchoolBus {
    
    private Time pickupFromSchool;
    private Time dropoffToARL;
    
    private Time pickupFromARL;
    private Time dropoffToSchool;
    
    public ARLBus() {
        super();
        pickupFromSchool = new Time();
        dropoffToARL = new Time();
    
        pickupFromARL = new Time();
        dropoffToSchool = new Time();
    }
    
    public ARLBus(int busNum, String driver, Time pickupFromSchool, Time dropoffToARL, Time pickupFromARL, Time dropoffToSchool) {
        super(busNum, driver);
        this.pickupFromSchool = pickupFromSchool;
        this.dropoffToARL = dropoffToARL;
        this.pickupFromARL = pickupFromARL;
        this.dropoffToSchool = dropoffToSchool;
    }
    
    public String toString() {
        String stops = "\nStops: " + "\nSchool Pickup: " + pickupFromSchool + "\nARL Dropoff: " + 
        dropoffToARL + "\nARL Pickup: " + pickupFromARL + "\nSchool Dropoff: " + dropoffToSchool;
        return super.toString() + stops;
    }
}
