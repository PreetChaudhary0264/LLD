package Questions.LRUCache.Service;

import Questions.LRUCache.Domain.Node;

import java.util.HashMap;
import java.util.LinkedList;

public class CacheService {
    private HashMap<Integer, Node> cache;
    private LinkedList<Node> lru;
    private int limit;
    private Node head;
    private Node tail;

    public CacheService(int limit){
        cache = new HashMap<>();
        lru = new LinkedList<>();
        this.limit = limit;
        head = new Node("dummy");
    }

    public String query(int num){
        String val = num + "#" + num;

        //LRU me most used ko head pr lga do taki least used tail prr aa jaye...mai sirf last se remove kr rha hu mane LRU ka galat matlab smjh liya hai but ho jayga

        if(cache.containsKey(num)){
            System.out.print("Returning from cache  ");
            return cache.get(num).getValue();
        }

        Node node = new Node(val);
        if(head.isNextNull()){
            head.next = node;
            node.prev = head;
            tail = node;
        }else{
            head.next.prev = node;
            node.next = head.next;
            head.next = node;
            node.prev = head;
        }

        String r = "";
        if(cache.size() == limit){
            r = tail.getValue();
            Node node_ = tail.prev;
            tail.prev = null;
            tail = node_;
            tail.next = null;
        }

        if(!r.equals("")){
            String rVal = cache.get(Integer.parseInt(String.valueOf(r.charAt(0)))).getValue();
            System.out.println("Clearing " + rVal + " from cache");
            cache.remove(Integer.parseInt(String.valueOf(r.charAt(0))));
        }

        cache.put(num, node);
        return val;
    }
}
