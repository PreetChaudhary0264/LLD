package BehaviouralPatterns.Template;

public class Main {
    public static void main(String[] args) {
//        Template model = new NeuralNetwork();
//        model.trainPipeline();

        Template model = new DecisionTree();
        model.trainPipeline();
    }
}
