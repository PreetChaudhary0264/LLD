package Practice.Creational.Factory;

public class Road implements Logistics {
    @Override
    public void send() {
        System.out.println("Items are being sent by road");
    }
}
