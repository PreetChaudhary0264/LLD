package Questions.TicTacToe;

public class Cell {
    private  int row;
    private  int col;
    private  Symbol symbol;

    Cell(int r,int c){
        this.col = c;
        this.row = r;
        this.symbol = null;
    }
    Cell(int r,int c,Symbol s){
        this.col = c;
        this.row = r;
        this.symbol = s;
    }

    public boolean isEmpty(){
        return symbol == null;
    }

    public Symbol getSymbol(){
        return symbol;
    }
}
