package BehaviouralPatterns.State;

public class Main {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight();

        light.show();
        light.next();

        light.show();
        light.next();

        light.show();
        light.next();
    }
}
