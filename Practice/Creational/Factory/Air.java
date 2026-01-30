package Practice.Creational.Factory;

public class Air implements Logistics {
    @Override
    public void send() {
        System.out.println("Items are being sent by air");
    }
}
