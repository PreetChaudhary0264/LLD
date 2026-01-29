package structuralPatterns.Adapter;

public class CheckoutService {
    private PaymentGateway gateway;

    CheckoutService(PaymentGateway gateway){
        this.gateway = gateway;
    }
    public void doCheckout(int orderId,int amount){
        gateway.pay(orderId,amount);
    }

    public static void main(String[] args) {
//        CheckoutService obj = new CheckoutService(new PayUIGateway());
//        obj.doCheckout(1,100);

        CheckoutService obj = new CheckoutService(new RazorpayAdaptar());
        obj.doCheckout(1,200);
    }
}
