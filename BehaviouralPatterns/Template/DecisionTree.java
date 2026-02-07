package BehaviouralPatterns.Template;

public class DecisionTree extends Template{
    @Override
    void load() {
        System.out.println("Data is loaded for decision trees");
    }

    @Override
    void preProcess() {
        System.out.println("Data is preProcessed for decision trees");
    }

    @Override
    void train() {
        System.out.println("Model trained for decision trees");
    }

    @Override
    void evaluate() {
        System.out.println("Model evaluated for decision trees");
    }

    @Override
    void deploy() {
        System.out.println("Model deployed for decision trees");
    }
}
