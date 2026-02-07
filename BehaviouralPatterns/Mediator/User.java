package BehaviouralPatterns.Mediator;

public class User {
    private ChatRoomMediator mediator;
    String name;

    User(String name,ChatRoomMediator m){
        this.name = name;
        this.mediator = m;
    }
    public void send(String msg){
        mediator.send(msg,this);
    }
    public void receive(String msg,String name){
        System.out.println("Received " + msg + " from " + name);
    }
}
