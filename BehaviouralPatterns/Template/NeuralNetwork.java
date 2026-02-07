package BehaviouralPatterns.Template;

public class NeuralNetwork extends Template{

//    NeuralNetwork(Template t){
//        super(t);
//    }
    @Override
    void load() {
        System.out.println("Data is loaded for neural networks");
    }

    @Override
    void preProcess() {
        System.out.println("Data is preProcessed for neural networks");
    }

    @Override
    void train() {
        System.out.println("Model trained for neural networks");
    }

    @Override
    void evaluate() {
        System.out.println("Model evaluated for neural networks");
    }

    @Override
    void deploy() {
        System.out.println("Model deployed for neural networks");
    }
}
