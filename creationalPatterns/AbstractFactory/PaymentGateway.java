package creationalPatterns.AbstractFactory;

public interface PaymentGateway {
    void processPayment();
}

//India factory
class Razorpay implements PaymentGateway{

    @Override
    public void processPayment() {
        System.out.println("Process is done by using razorpay");
    }
}

class PayUiGateway implements PaymentGateway{

    @Override
    public void processPayment() {
        System.out.println("Payment is done by using payUI gateway");
    }
}

//US Factory
class Stripe implements PaymentGateway{

    @Override
    public void processPayment() {
        System.out.println("Payment is done by Stripe");
    }
}

class PayPal implements PaymentGateway{

    @Override
    public void processPayment() {
        System.out.println("Payment is done by payPal");
    }
}

//Ek .java file me sirf ONE public top-level class / interface ho sakti hai
//aur
//uska naam file ke naam ke equal hona chahiye
