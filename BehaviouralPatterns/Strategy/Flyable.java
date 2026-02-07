package BehaviouralPatterns.Strategy;

public interface Flyable {
    public  abstract void fly();
}

class FlyWithWings implements Flyable{

    @Override
    public void fly() {
        System.out.println("Flying usign wings");
    }
}

class FlyWithJets implements Flyable{

    @Override
    public void fly() {
        System.out.println("Flying wusign jets");
    }
}