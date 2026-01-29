package creationalPatterns.Singleton;

public class SingletonPattern {
    public static final SingletonPattern instance = new SingletonPattern();

    //Eager loading => object is being created when the class is loaded
    //Is it thread safe

    private SingletonPattern(){}

    public static SingletonPattern getInstance(){
        return instance;
    }
}
