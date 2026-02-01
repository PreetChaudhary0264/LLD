package structuralPatterns.FlyWeight.Solution;

import java.util.HashMap;

public class TreeFactory {
    static HashMap<String,TreeType> memo = new HashMap<>();

    public static TreeType getTreeType(String name,String color,String texture){
        String key = name + "#" + color + "#" + texture;
        if(!memo.containsKey(key)){
            memo.put(key,new TreeType(name,color,texture));
        }
        return memo.get(key);
    }
}
