package BehaviouralPatterns.Strategy;

public interface Talkable {
     void talk();
}

class NormalTalk implements Talkable{

    @Override
    public void talk() {
        System.out.println("Robot will talk normally");
    }
}

class FishiTalk implements Talkable{

    @Override
    public void talk() {
        System.out.println("Robit will talk fishi");
    }
}
