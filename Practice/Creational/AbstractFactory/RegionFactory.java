package Practice.Creational.AbstractFactory;

public interface RegionFactory {
    Payment handlePayment(String gatewayType);
    Invoice handleInvoice();
}
