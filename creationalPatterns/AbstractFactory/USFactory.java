package creationalPatterns.AbstractFactory;

public class USFactory implements RegionFactory{
    @Override
    public PaymentGateway handlePayments(String gatewayType) {
        if(gatewayType.equals("stripe")){
            return new Stripe();
        }
        return new PayPal();
    }

    @Override
    public Invoice handleInvoice() {
        return new USInvoice();
    }
}
