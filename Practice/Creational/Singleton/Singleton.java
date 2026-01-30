package Practice.Creational.Singleton;

public class Singleton {
//    private static Singleton instance = new Singleton();  //eager loading

    private static Singleton instance;

//    private static volatile Singleton instance;

    private Singleton(){}

//    public static Singleton getInstance(){
//        if(instance == null){
//            instance = new Singleton();
//        }
//        return instance;
//    }

//    public static synchronized Singleton getInstance(){
//        if(instance == null){
//            instance = new Singleton();
//        }
//        return instance;
//    }

//    public static Singleton getInstance(){
//        if(instance == null){
//            synchronized (Singleton.class){
//                if(instance == null){
//                    instance = new Singleton();
//                }
//            }
//        }
//        return  instance;
//    }

    static class Header{
        private static Singleton instance = new Singleton();
    }

    public static Singleton getInstance(){
        return Header.instance;
    }

}
