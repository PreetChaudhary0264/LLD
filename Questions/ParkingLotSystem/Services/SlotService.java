package Questions.ParkingLotSystem.Services;

import Questions.ParkingLotSystem.Domain.ParkingLot;
import Questions.ParkingLotSystem.Domain.Slot;
import Questions.ParkingLotSystem.Domain.Ticket;
import Questions.ParkingLotSystem.Domain.Vehicle;

public class SlotService {
    private ParkingLot parkingLot;

    public SlotService(int capacity){
        parkingLot = new ParkingLot(capacity);
    }

    public Ticket parkVehicle(Vehicle vehicle){
        Slot slot = parkingLot.findAvailableSlot();

        if(slot == null){
            System.out.println("There is no slot available to park vehicle");
            return null;
        }

        slot.parkVehicle(vehicle);
        vehicle.assignSlot(slot);
        Ticket ticket = TicketService.generateTicket(slot, vehicle);
        System.out.println("Vehicle " + vehicle.getName() + " Parked");
        return ticket;
    }

    public void removeVehicle(Ticket ticket){
        int slotId = ticket.getSlotNo().getSlotId();
        Slot slot = parkingLot.getSlots().get(slotId - 1);
        slot.removeVehicle();

        System.out.println("Vehicle is removed from " + slotId + " and slot is now free for use");
    }
}
