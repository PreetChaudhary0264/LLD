package Practice.Creational.AbstractFactory;

public class IndiaFactory implements RegionFactory{
    @Override
    public Payment handlePayment(String gatewayType) {
        if (gatewayType.equals("razorpay")) {
            return new Razorpay();
        }
        return new PyUIGateway();
    }

    @Override
    public Invoice handleInvoice() {
        return new GSTInvoice();
    }
}
