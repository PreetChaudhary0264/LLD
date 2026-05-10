package Questions.LFUCache;

public class DoublyLinkedList {
    Node head;
    Node tail;

    public DoublyLinkedList(){
        head = new Node(-1,"head");
        tail = new Node(-1,"tail");

        head.next = tail;
        tail.prev = head;
    }
}
