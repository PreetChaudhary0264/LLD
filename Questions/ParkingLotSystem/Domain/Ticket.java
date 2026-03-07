package Questions.ParkingLotSystem.Domain;

public class Ticket {
    private int ticketId;
    private Slot slot;
    private int entryTime;   //in seconds
    private Vehicle vehicle;

    public Ticket(Slot slot, Vehicle vehicle, int ticketId,int entryTime){
        this.slot = slot;
        this.vehicle = vehicle;
        this.ticketId = ticketId;
        this.entryTime = entryTime;
    }
    public Slot getSlotNo(){
        return slot;
    }
    public Vehicle getVehicle(){
        return vehicle;
    }
    public int getTicketId(){
        return ticketId;
    }
}
