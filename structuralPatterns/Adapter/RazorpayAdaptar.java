package structuralPatterns.Adapter;

public class RazorpayAdaptar implements PaymentGateway {
    private RazorpayAPI gateway;
    RazorpayAdaptar(){
        this.gateway = new RazorpayAPI();
    }
    @Override
    public void pay(int orderId, int amount) {
        gateway.makePayment(orderId,amount);  //adapting parameters
    }
}
