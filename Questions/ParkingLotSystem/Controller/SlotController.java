package Questions.ParkingLotSystem.Controller;

import Questions.ParkingLotSystem.Domain.Vehicle;
import Questions.ParkingLotSystem.Services.SlotService;

public class SlotController {
    SlotService slotService;

    public SlotController(int capacity){
        slotService = new SlotService(capacity);
    }

    public void parkVehicle(Vehicle vehicle){
        slotService.parkVehicle(vehicle);
    }
    public void leave(int slotId){
        slotService.removeVehicle(slotId);
    }
}
