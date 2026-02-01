package structuralPatterns.FlyWeight.Solution;

public class Tree {
    private int x;
    private int y;
    private TreeType treeType;

    public Tree(int x,int y,TreeType treetype){
        this.x = x;
        this.y = y;
        this.treeType = treetype;
    }

    public void draw(){
        treeType.draw(x,y);
    }
}
