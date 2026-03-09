package Questions.LRUCache.Controller;

import Questions.LRUCache.Service.CacheService;

public class CacheController {
    CacheService cs;

    public CacheController(int limit){
        cs = new CacheService(limit);
    }

    public String giveData(int num){
        return cs.query(num);
    }
}
