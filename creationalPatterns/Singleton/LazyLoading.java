package creationalPatterns.Singleton;

public class LazyLoading {
    public static LazyLoading instance;

    private LazyLoading(){}

    public static LazyLoading getInstance(){
        if(instance == null){
            instance = new LazyLoading();
        }
        return instance;
    }

    //Lazy loading => is is not thread safe bcoz in multithreadin gu might end up creating more than one instance
}
