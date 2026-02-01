package BehaviouralPatterns.Observer;

public class MobileSubscriber implements Subscriber{
    @Override
    public void update() {
        System.out.println("Mobile Subscriber is updated");
    }
}
