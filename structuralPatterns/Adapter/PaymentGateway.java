package structuralPatterns.Adapter;

public interface PaymentGateway {
    void pay(int orderId,int amount);
}
