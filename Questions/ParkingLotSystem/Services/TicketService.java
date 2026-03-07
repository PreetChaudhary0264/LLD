package Questions.ParkingLotSystem.Services;

import Questions.ParkingLotSystem.Domain.Slot;
import Questions.ParkingLotSystem.Domain.Ticket;
import Questions.ParkingLotSystem.Domain.Vehicle;
import Questions.ParkingLotSystem.Domain.VehicleType;

import java.util.HashMap;
import java.util.Map;

public class TicketService {
    private Map<Integer, Ticket> tickets = new HashMap<>();
    private int ticketCounter = 1;

    public Ticket generateTicket(Slot slot, Vehicle vehicle){
        int entryTime = (int)(System.currentTimeMillis()/1000);

        Ticket ticket = new Ticket(slot,vehicle);
    }
}
