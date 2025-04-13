import java.util.*;

public class MyProgram
{
    public static void main(String[] args)
    {
        
        SchoolBus myBus = new SchoolBus(892, "Mr.Lee");
        Time myAM = new Time(7, "18", "AM");
        Time myPM = new Time(3, "02", "PM");
        Time renAM = new Time(7, "08", "AM");
        Time renPM = new Time(2, "54", "PM");
        Stop myAMstop = new Stop(myAM, "Cavalier Wood Road", 11);
        Stop myPMstop = new Stop(myPM, "Cavalier Wood Road", 9);
        Stop renAMstop = new Stop(renAM, "Verona Court Drive", 14);
        Stop renPMstop = new Stop(renPM, "Verona Court Drive", 8);
        ArrayList<Stop> amStops = new ArrayList<Stop>();
        amStops.add(myAMstop);
        amStops.add(renAMstop);
        ArrayList<Stop> pmStops = new ArrayList<Stop>();
        pmStops.add(myPMstop);
        pmStops.add(renPMstop);

        PickupBus pickup = new PickupBus(amStops);
        DropoffBus dropoffs = new DropoffBus(892, "Mr. Lee", pmStops);
        
        Time schoolPickup = new Time(7, "50", "AM");
        Time arlDrop = new Time(8, "05", "AM");
        Time arlPickup = new Time(9, "30", "AM");
        Time schoolDrop = new Time(10, "05", "AM");
        ARLBus arl = new ARLBus(924, "Ms. Emily", schoolPickup, arlDrop, arlPickup, schoolDrop);;
        
        System.out.println("Pickup: " + pickup + "\n");
        System.out.println("Dropoff: " + dropoffs + "\n");
        System.out.println("ARL: " + arl);
        
        /* We could add a bus roster class that keeps tracks of
           all the buses, their information, and keeps track of
           any buses that are replaced due to issues */
    }
}
