package structuralPatterns.FlyWeight.Solution;

import java.util.ArrayList;

public class Forest {
    ArrayList<Tree> forest = new ArrayList<>();

    public void plantTree(int x,int y,String name,String color,String texture){
//        TreeType treeType = new TreeType("neem","green","soft");
        TreeType treeType = TreeFactory.getTreeType(name,color,texture);
        Tree tree = new Tree(x,y,treeType);
        forest.add(tree);
    }

    public void draw(){
        for(Tree tree : forest){
            tree.draw();
        }
    }
}
