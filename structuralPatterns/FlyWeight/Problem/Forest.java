package structuralPatterns.FlyWeight.Problem;

import java.util.ArrayList;

public class Forest {
    ArrayList<Tree> forest = new ArrayList<>();

    public void plantTree(int x,int y,String name,String color,String texture){
        Tree tree = new Tree(x,y,name,color,texture);
        forest.add(tree);
    }

    public void draw(){
        for(Tree tree : forest){
            tree.draw();
        }
    }
}
