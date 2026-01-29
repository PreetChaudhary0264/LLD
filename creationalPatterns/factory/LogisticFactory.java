package creationalPatterns.factory;

public class LogisticFactory {
    public static Logistics getLogistics(String mode){
        if(mode.equals("Road")){
            return new Road();
        }
        return new Air();
    }
}
