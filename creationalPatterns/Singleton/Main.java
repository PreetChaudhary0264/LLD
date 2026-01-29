package creationalPatterns.Singleton;

public class Main {
    public static void main(String[] args) {
        SingletonPattern obj = SingletonPattern.getInstance();
        SingletonPattern obj2 = SingletonPattern.getInstance();
        System.out.println(obj);
        System.out.println(obj2);
    }
}
