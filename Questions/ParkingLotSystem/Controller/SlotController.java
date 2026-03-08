package Questions.ParkingLotSystem.Controller;

import Questions.ParkingLotSystem.Domain.Ticket;
import Questions.ParkingLotSystem.Domain.Vehicle;
import Questions.ParkingLotSystem.Services.SlotService;

public class SlotController {
    SlotService slotService;
    Ticket ticket;

    public SlotController(int capacity){
        slotService = new SlotService(capacity);
    }

    public Ticket parkVehicle(Vehicle vehicle){

        ticket = slotService.parkVehicle(vehicle);
        return ticket;
    }
    public void leave(Ticket ticket){
        slotService.removeVehicle(ticket);
    }
}
