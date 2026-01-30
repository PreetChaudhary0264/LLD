package Practice.Creational.Factory;

public class LogisticService {
    private Logistics l;

    public void send(String mode){
//        if(mode.equals("air")){
//            Logistics obj = new Air();
//            obj.send();
//        }
//        Logistics obj = new Road();
//        obj.send();

        l = LogisticFactory.getLogistics(mode);  //cast sirf name conflict ki wajah se krna pda
        l.send();

    }

    public static void main(String[] args) {
//        LogisticService obj = new LogisticService();
//        obj.send("road");

        LogisticService obj = new LogisticService();
        obj.send("road");

    }
}
