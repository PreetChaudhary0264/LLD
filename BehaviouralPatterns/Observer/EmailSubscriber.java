package BehaviouralPatterns.Observer;

public class EmailSubscriber implements Subscriber{
    @Override
    public void update() {
        System.out.println("Email subscriber is updated");
    }
}
