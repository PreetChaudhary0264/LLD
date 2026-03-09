package Questions.LRUCache.Domain;

public class Node {
    private String value;
    public Node next;
    public Node prev;

    public Node(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }

    public boolean isNextNull() {
        return this.next == null;
    }
}
