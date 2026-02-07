package BehaviouralPatterns.Mediator;

public class Main {
    public static void main(String[] args) {
        ChatRoom mediator = new ChatRoom();
        User user1 = new User("preet",mediator);
        User user2 = new User("ankit",mediator);
        User user3 = new User("nabh",mediator);

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        user1.send("Hi! how are u?");
    }
}
