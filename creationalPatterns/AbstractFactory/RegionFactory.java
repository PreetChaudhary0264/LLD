package creationalPatterns.AbstractFactory;

public interface RegionFactory {
    PaymentGateway handlePayments(String gatewayType);
    Invoice handleInvoice();
}
