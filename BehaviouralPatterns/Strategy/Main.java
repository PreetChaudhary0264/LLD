package BehaviouralPatterns.Strategy;

public class Main {
    public static void main(String[] args) {
        Robot robot = new CompanionRobot(new FishiTalk(),new FlyWithJets());
        robot.projection();
        robot.talk();
        robot.fly();
    }
}
