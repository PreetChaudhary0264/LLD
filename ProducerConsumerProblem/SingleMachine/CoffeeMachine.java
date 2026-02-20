package ProducerConsumerProblem.SingleMachine;

public class CoffeeMachine {
    private boolean isCoffeeReady = false;

    public synchronized void makeCoffee() throws InterruptedException {
        while (isCoffeeReady){
            wait();  //wait till coffee is consumed
        }

        System.out.println("Coffee is being produced..");
        Thread.sleep(1000);    //time to make coffee
        isCoffeeReady = true;
        System.out.println("Coffee is ready");
        notify();  //notify consumer
    }

    public synchronized void drinkCoffee() throws InterruptedException {
        while(!isCoffeeReady){  //to protect spurious wakeup
            wait();
        }

        System.out.println("Coffee is consumed by consumer");
        Thread.sleep(1000);  //time to consume coffee
        isCoffeeReady = false;
        System.out.println("Coffee is consumed - ready for next cup");
        notify();   //notify producer
    }
}
