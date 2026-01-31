package Practice.Creational.AbstractFactory;

public interface Payment {
    void processPayment();
}

class Razorpay implements Payment{
    @Override
    public void processPayment() {
        System.out.println("Payment is done by razorpay");
    }
}

class PyUIGateway implements Payment{
    @Override
    public void processPayment() {
        System.out.println("Payment id done by PayUI Gateway");
    }
}


class Stripe implements Payment{
    @Override
    public void processPayment() {
        System.out.println("Payment id done by Stripe Gateway");
    }
}


class PayPal implements Payment{
    @Override
    public void processPayment() {
        System.out.println("Payment id done by PayPal Gateway");
    }
}
