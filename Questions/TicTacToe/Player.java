package Questions.TicTacToe;

public class Player {
    String name;
    Symbol symbol;

    Player(String name,Symbol s){
        this.name = name;
        this.symbol = s;
    }

    public String getName(){
        return name;
    }
    public Symbol getSymbol(){
        return symbol;
    }
}
