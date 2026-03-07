package Questions.ParkingLotSystem.Services;

import Questions.ParkingLotSystem.Domain.ParkingLot;
import Questions.ParkingLotSystem.Domain.Slot;
import Questions.ParkingLotSystem.Domain.Vehicle;

public class SlotService {
    private ParkingLot parkingLot;

    public SlotService(int capacity){
        parkingLot = new ParkingLot(capacity);
    }

    public void parkVehicle(Vehicle vehicle){
        Slot slot = parkingLot.findAvailableSlot();

        if(slot == null){
            System.out.println("There is no slot available to park vehicle");
            return;
        }

        slot.parkVehicle(vehicle);
        vehicle.assignSlot(slot);
        System.out.println("Vehicle " + vehicle.getName() + " Parked");
    }

    public void removeVehicle(int slotId){
        Slot slot = parkingLot.getSlots().get(slotId - 1);
        slot.removeVehicle();

        System.out.println("Vehicle is removed from " + slotId + " and slot is now free for use");
    }
}
