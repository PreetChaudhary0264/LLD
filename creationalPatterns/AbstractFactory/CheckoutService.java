package creationalPatterns.AbstractFactory;

public class CheckoutService {
    private String gatewayType;
    private PaymentGateway payment;
    public CheckoutService(String gatewayType){
        this.gatewayType = gatewayType;
    }

    public CheckoutService(){}


    public CheckoutService doCheckout(RegionFactory factory,String gatewayType){

        // breaking core principle SRP
//        PaymentGateway payment;
//        if(gatewayType.equals("razorpay")){
//            payment = new Razorpay();
//        }else{
//            payment = new PayUiGateway();
//        }
//        payment.processPayment();
//        Invoice invoice = new GSTInvoice();
//        invoice.generateInvoice();

        //object creation logic should be kept seperated
        //this is only for india
        PaymentGateway obj =  CheckoutMethod.handleCheckout("razorpay");
        obj.processPayment();
        Invoice invoice = CheckoutMethod.handleinvoice();
        invoice.generateInvoice();

         return new CheckoutService();

        //But what if we are extending it to US or Japan or on a big extent?
    }

    private PaymentGateway paymentGateway;
    private Invoice invoice;

    CheckoutService(RegionFactory factory,String gatewayType){
        this.paymentGateway = factory.handlePayments(gatewayType);
        this.invoice = factory.handleInvoice();
    }

    public void completeOrder(){
        paymentGateway.processPayment();
        invoice.generateInvoice();
    }

    public static void main(String[] args) {
//        CheckoutService obj = new CheckoutService("razorpay");
//        obj.doCheckout();

//        CheckoutService obj = new CheckoutService().doCheckout(new USFactory(),"razorpay");

          CheckoutService obj = new CheckoutService(new JapanFactory(),"JapanSecondType");
          obj.completeOrder();
    }
}
