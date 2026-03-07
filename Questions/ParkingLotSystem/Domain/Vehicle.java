package Questions.ParkingLotSystem.Domain;

public class Vehicle {
    private int plateNumber;
    private Slot slot;
    private String name;

    public Vehicle(String name, int plateNumber){
        this.plateNumber = plateNumber;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void assignSlot(Slot slot){
        this.slot = slot;
    }
}
