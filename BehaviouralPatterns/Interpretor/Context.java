package BehaviouralPatterns.Interpretor;

import java.util.Set;

public class Context {
    private Set<String> data;

    Context(Set<String> context){
        this.data = context;
    }

    public boolean contains(String key){
        return data.contains(key);
    }
}
