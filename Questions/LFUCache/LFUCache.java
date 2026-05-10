package Questions.LFUCache;

import java.util.HashMap;

public class LFUCache {
    private HashMap<Integer, Node> cache;
    private HashMap<Integer, DoublyLinkedList> freqMap;
    private int minFreq;
}
