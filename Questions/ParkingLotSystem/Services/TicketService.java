package Questions.ParkingLotSystem.Services;

import Questions.ParkingLotSystem.Domain.Slot;
import Questions.ParkingLotSystem.Domain.Ticket;
import Questions.ParkingLotSystem.Domain.Vehicle;

import java.util.HashSet;
import java.util.Set;

public class TicketService {
    private static Set<Integer> tickets = new HashSet<>();
    private static int ticketCounter = 1;

    public static Ticket generateTicket(Slot slot, Vehicle vehicle){
        int entryTime = (int)(System.currentTimeMillis()/1000);

        int tId = ticketCounter;
        if(!tickets.isEmpty()){
            for(int val : tickets){
                tId = val;
                break;
            }
            tickets.remove(tId);
        }

        Ticket ticket = new Ticket(slot,vehicle,tId,entryTime);
        ticketCounter++;
        System.out.println("Ticket is generated with slot " + ticket.getSlotNo().getSlotId() + " for vehicle " + ticket.getVehicle().getName());
        return ticket;
    }

    public void resetTicket(Ticket ticket){
        int id = ticket.getTicketId();
        ticket.removeTicket();

        tickets.add(id);
        System.out.println("Ticket is freed");
    }
}
