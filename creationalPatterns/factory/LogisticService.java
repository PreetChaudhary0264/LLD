package creationalPatterns.factory;

public class LogisticService {
    public void send(String mode){

//        if(mode.equals("Air")){
//            Logistics obj = new Air();
//            obj.send();
//        }else{
//            Logistics obj = new Road();
//            obj.send();
//        }
        //Violating SRP

        Logistics obj = LogisticFactory.getLogistics(mode);
        obj.send();
    }
    public static void main(String[] args) {
        LogisticService obj = new LogisticService();
        obj.send("Air");
    }
}
