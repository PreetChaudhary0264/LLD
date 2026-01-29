package creationalPatterns.AbstractFactory;

public class CheckoutService {
    private String gatewayType;
    private PaymentGateway payment;
    public CheckoutService(String gatewayType){
        this.gatewayType = gatewayType;
    }

    public CheckoutService(){}


    public CheckoutService doCheckout(RegionFactory factory,String gatewayType){

        //this is only for india and also breaking core principle SRP
//        PaymentGateway payment;
//        if(gatewayType.equals("razorpay")){
//            payment = new Razorpay();
//        }else{
//            payment = new PayUiGateway();
//        }
//        payment.processPayment();
//        Invoice invoice = new GSTInvoice();
//        invoice.generateInvoice();



//        PaymentGateway obj = new CheckoutMethod().handleCheckout("razorpay");
//        obj.processPayment();
//        Invoice invoice = new GSTInvoice();
//        invoice.generateInvoice();

         PaymentGateway obj = factory.handlePayments(gatewayType);
         Invoice obj2 = factory.handleInvoice();
         obj.processPayment();
         obj2.generateInvoice();

         return new CheckoutService();

        //But what if we are extending it to US or Japan or on a big extent?


    }

    public static void main(String[] args) {
//        CheckoutService obj = new CheckoutService("razorpay");
//        obj.doCheckout();

        CheckoutService obj = new CheckoutService().doCheckout(new USFactory(),"razorpay");

    }
}
