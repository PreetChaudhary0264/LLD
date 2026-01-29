package creationalPatterns.factory;

public class Road implements Logistics{
    @Override
    public void send() {
        System.out.println("Sennding by road");
    }
}
