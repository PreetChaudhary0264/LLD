package Questions.LRUCache;

import Questions.LRUCache.Controller.CacheController;

public class Main {
    public static void main(String[] args) {
        //isme service , controllers ki zarurat nhi because ye simpledata structure design hai, API wagera nhi


        CacheController cc = new CacheController(5);
        System.out.println(cc.giveData(2));
        System.out.println(cc.giveData(3));
        System.out.println(cc.giveData(4));
        System.out.println(cc.giveData(2));
        System.out.println(cc.giveData(6));
        System.out.println(cc.giveData(7));
        System.out.println(cc.giveData(8));
        System.out.println(cc.giveData(9));
    }
}
