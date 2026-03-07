package Questions.ParkingLotSystem.Domain;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    List<Slot> totalSlots;

    public ParkingLot(int capacity){
        totalSlots = new ArrayList<>();

        for(int i = 1; i <= capacity; i++){
            totalSlots.add(new Slot(i, VehicleType.Four_Wheller));
        }
    }

    public Slot findAvailableSlot(){
        for(Slot slot : totalSlots){
            if(slot.occupied())return slot;
        }
        return null;
    }

    public List<Slot> getSlots() {
        return totalSlots;
    }
}
