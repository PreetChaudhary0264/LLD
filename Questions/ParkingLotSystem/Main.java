package Questions.ParkingLotSystem;

import Questions.ParkingLotSystem.Controller.SlotController;
import Questions.ParkingLotSystem.Domain.Ticket;
import Questions.ParkingLotSystem.Domain.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Bullet", 264);
        SlotController parking = new SlotController(50);
        Ticket ticket = parking.parkVehicle(vehicle);
        parking.leave(ticket);

        Vehicle vehicle2 = new Vehicle("Maruti 800", 2064);
        Ticket ticket2 = parking.parkVehicle(vehicle2);
        parking.leave(ticket2);
    }
}
