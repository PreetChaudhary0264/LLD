package BehaviouralPatterns.State;

public class YellowLight implements TrafficLightScale{
    @Override
    public void next(TrafficLight light) {
        light.setState(new RedLight());
    }

    @Override
    public void show() {
        System.out.println("Yellow - Wait");
    }
}
