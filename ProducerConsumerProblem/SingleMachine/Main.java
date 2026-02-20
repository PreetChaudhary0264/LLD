package ProducerConsumerProblem.SingleMachine;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffee = new CoffeeMachine();

        Thread producer = new Thread(() -> {
            while(true){
                try{
                    coffee.makeCoffee();
                }catch(InterruptedException e){
                    System.out.println(e.getMessage());
                }
            }
        });

        Thread consumer = new Thread(() -> {
            while(true){
                try{
                    coffee.drinkCoffee();
                }catch(InterruptedException e){
                    System.out.println(e.getMessage());
                }
            }
        });

        producer.start();
        consumer.start();
    }
}
