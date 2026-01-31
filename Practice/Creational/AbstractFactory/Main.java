package Practice.Creational.AbstractFactory;

public class Main {
    private static String gatewayType;
    private static RegionFactory factory;

    Main(RegionFactory factory,String gatewayType){
        this.factory = factory;
        this.gatewayType = gatewayType;
    }

    public static void doPayment(){
        //this is only for india
//        Payment gateway = GenerateInvoice.giveObject(gatewayType);
//        gateway.processPayment();
//        Invoice obj = GenerateInvoice.giveInvoice();
//        obj.generateInvoice();

        Payment obj = factory.handlePayment(gatewayType);
        Invoice invoice = factory.handleInvoice();
        obj.processPayment();
        invoice.generateInvoice();
    }
    public static void main(String[] args) {
        Main obj = new Main(new USFactory(),"stripe");
        obj.doPayment();
    }
}
