package creationalPatterns.AbstractFactory;

public class CheckoutMethod {

    public static PaymentGateway handleCheckout(String gatewayType){
        if(gatewayType.equals("razorpay")){
            return new Razorpay();
        }
        return new PayUiGateway();
    }

    public static Invoice handleinvoice(){
        return new GSTInvoice();
    }
}
