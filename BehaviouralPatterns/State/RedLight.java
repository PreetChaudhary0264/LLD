package BehaviouralPatterns.State;

public class RedLight implements TrafficLightScale{
    @Override
    public void next(TrafficLight light) {
        light.setState(new GreenLight());
    }

    @Override
    public void show() {
        System.out.println("Red - Stop");
    }
}
