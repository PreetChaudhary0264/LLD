package structuralPatterns.Adapter;

public class PayUIGateway implements PaymentGateway {

    @Override
    public void pay(int orderId,int amount) {
        System.out.println("Paying using PayUIGateway");
    }
}
