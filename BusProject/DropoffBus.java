import java.util.*;

public class DropoffBus extends SchoolBus {
    
    private ArrayList<Stop> dropOffs;
    
    public DropoffBus() {
        super();
        dropOffs = new ArrayList<Stop>();
    }
    
    public DropoffBus(int busNum, String driver, ArrayList<Stop> stops) {
        super(busNum, driver);
        dropOffs = stops;
    }
    
    public void addStop(Stop stop) {
        dropOffs.add(stop);
    }
    
    public String toString() {
        String stops = "";
        for (int i = 0; i < dropOffs.size(); i++) {
            stops += "\n" + dropOffs.get(i);
        }
        return super.toString() + "\nStops:" + stops;
    }
    
}
