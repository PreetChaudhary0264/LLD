package creationalPatterns.AbstractFactory;

public class JapanFactory implements RegionFactory{
    @Override
    public PaymentGateway handlePayments(String gatewayType) {
        if(gatewayType.equals("one")){
            return new JapanFirstType();
        }
        return new JapanSecondType();
    }

    @Override
    public Invoice handleInvoice() {
        return new JapanInvoice();
    }
}
