package BehaviouralPatterns.Interpretor;

public class ORExpression implements Expression{
    Expression exp1;
    Expression exp2;

    ORExpression(Expression e1,Expression e2){
        this.exp1 = e1;
        this.exp2 = e2;
    }

    @Override
    public boolean interpret(Context ctx) {
        return exp1.interpret(ctx) || exp2.interpret(ctx);
    }
}
