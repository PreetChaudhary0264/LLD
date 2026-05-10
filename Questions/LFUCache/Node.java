package Questions.LFUCache;

public class Node {
     int key;
     String value;
     Node next;
     Node prev;

    public Node(int key, String value){
        this.key = key;
        this.value = value;
    }
}
