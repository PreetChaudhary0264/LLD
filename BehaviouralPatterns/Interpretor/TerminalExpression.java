package BehaviouralPatterns.Interpretor;

public class TerminalExpression implements Expression{
    String word;

    TerminalExpression(String w){
        this.word = w;
    }

    @Override
    public boolean interpret(Context ctx) {
        return ctx.contains(word);
    }
}
