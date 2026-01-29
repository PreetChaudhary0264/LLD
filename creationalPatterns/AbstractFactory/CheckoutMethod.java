package creationalPatterns.AbstractFactory;

public class CheckoutMethod {
    private String gatewayType;
    private String invoice;

    public PaymentGateway handleCheckout(String gatewayType){
        if(gatewayType.equals("razorpay")){
            return new Razorpay();
        }
        return new PayUiGateway();
    }
}
