package creationalPatterns.Singleton;

public class BillPughSingleton {

    private BillPughSingleton(){}

    //class loading is threas safe it ias loaded only once
    private static class Holder{
        private static final BillPughSingleton instance = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return Holder.instance;   //only one instace will be created bcoz class is loaded only once
    }

    public static void main(String[] args) {
        BillPughSingleton obj = new BillPughSingleton();   //BillPugh class loaded
        obj.getInstance();  //Hoilder class loaded

        BillPughSingleton obj2 = new BillPughSingleton();
        obj2.getInstance();
    }
}
