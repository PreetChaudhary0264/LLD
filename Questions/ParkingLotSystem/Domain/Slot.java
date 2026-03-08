package Questions.ParkingLotSystem.Domain;

public class Slot {
    private Vehicle vehicle;
    private int slotId;
    private VehicleType vehicleType;
    private boolean isOccupied = false;

    public Slot(int slotId, VehicleType vehicleType){
        this.slotId = slotId;
        this.vehicleType = vehicleType;
    }

    public boolean occupied(){
        return isOccupied;
    }

    public void parkVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
        isOccupied = true;
    }

    public void removeVehicle(){
        this.vehicle = null;
        isOccupied = false;
    }
    public int getSlotId(){
        return slotId;
    }
    public VehicleType getVehicleType(){
        return vehicleType;
    }
}
