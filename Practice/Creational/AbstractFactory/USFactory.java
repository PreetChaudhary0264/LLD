package Practice.Creational.AbstractFactory;

public class USFactory implements RegionFactory{
    @Override
    public Payment handlePayment(String gatewayType) {
        if (gatewayType.equals("stripe")){
            return new Stripe();
        }
        return new PayPal();
    }

    @Override
    public Invoice handleInvoice() {
        return new USInvoice();
    }
}
