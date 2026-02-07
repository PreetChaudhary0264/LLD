package BehaviouralPatterns.Mediator;

import java.util.ArrayList;

public class ChatRoom implements ChatRoomMediator{
    ArrayList<User> users = new ArrayList<>();

    public void addUser(User user){
        users.add(user);
    }

    @Override
    public void send(String msg, User sender) {
        for(User user : users){
            if(user != sender){
                user.receive(msg,sender.name);
            }
        }
    }
}
