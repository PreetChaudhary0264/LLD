package BehaviouralPatterns.Strategy;

public class CompanionRobot extends Robot{

    CompanionRobot(Talkable t,Flyable f){
        this.t = t;
        this.f = f;
    }
    @Override
    public void projection() {
        System.out.println("This is projection of the companion robot");
    }
}
