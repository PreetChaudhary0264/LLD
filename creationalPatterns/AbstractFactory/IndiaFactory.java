package creationalPatterns.AbstractFactory;

public class IndiaFactory implements RegionFactory{

    @Override
    public PaymentGateway handlePayments(String gatewayType) {
        if(gatewayType.equals("razorpay")){
            return new Razorpay();
        }
        return new PayUiGateway();
    }

    @Override
    public Invoice handleInvoice() {
        return new GSTInvoice();
    }
}
