package Practice.Creational.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        System.out.println(obj);
        Singleton obj2 = Singleton.getInstance();
        System.out.println(obj2);
    }
}
