package Practice.Creational.AbstractFactory;

public class GenerateInvoice {

    public static Payment giveObject(String geteway){
        if(geteway.equals("razorpay")){
            return new Razorpay();
        }
        return new PyUIGateway();
    }
    public static Invoice giveInvoice(){
        return new GSTInvoice();
    }
}
