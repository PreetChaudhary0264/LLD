package BehaviouralPatterns.State;

public class GreenLight implements TrafficLightScale{
    @Override
    public void next(TrafficLight light) {
        light.setState(new YellowLight());
    }

    @Override
    public void show() {
        System.out.println("Green - Go slow");
    }
}
