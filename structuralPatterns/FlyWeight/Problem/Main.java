package structuralPatterns.FlyWeight.Problem;

public class Main {
    public static void main(String[] args) {
        Forest forest = new Forest();

        //planting 1 million trees
        for(int i = 0; i < 1000000; i++){
            forest.plantTree(i,i,"neem","green","soft");
        }
    }
}
