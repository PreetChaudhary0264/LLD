package BehaviouralPatterns.Interpretor;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Context ctx = new Context(Set.of("ADMIN","USER"));

        Expression isAdmin = new TerminalExpression("ADMIN");
        Expression isManager = new TerminalExpression("MANAGER");

        Expression rule = new ORExpression(isAdmin,isManager);
        System.out.println(rule.interpret(ctx));
    }
}
