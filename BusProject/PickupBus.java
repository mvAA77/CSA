import java.util.*;

public class PickupBus extends SchoolBus {
    
    private ArrayList<Stop> pickups;
    
    public PickupBus() {
        super();
        pickups = new ArrayList<Stop>();
    }
    
    public PickupBus(ArrayList<Stop> stops) {
        super(busNum, driver);
        pickups = stops;
    }
    
    public void addStop(Stop stop) {
        pickups.add(stop);
    }
    
    public String toString() {
        String stops = "";
        for (int i = 0; i < pickups.size(); i++) {
            stops += "\n" + pickups.get(i);
        }
        return super.toString() + "\nStops:" + stops;
    }
}
