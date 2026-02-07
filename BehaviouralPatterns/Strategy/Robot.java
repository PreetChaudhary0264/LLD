package BehaviouralPatterns.Strategy;

public abstract class Robot {
    Talkable t;
    Flyable f;

    public void talk(){
        t.talk();
    }
    public void fly(){
        f.fly();
    }

    public abstract void projection();
}
