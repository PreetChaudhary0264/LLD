package creationalPatterns.Singleton;

public class SynchronizedKeyword {
    public static SynchronizedKeyword instance;

    private SynchronizedKeyword(){}

    public static synchronized SynchronizedKeyword getInstance(){
        if(instance == null){
            instance = new SynchronizedKeyword();
        }
        return instance;
    }

    //but synchronized keyword is inefficient
    //this synchronized is being called for every call we can solve this using doublke check locking
}
