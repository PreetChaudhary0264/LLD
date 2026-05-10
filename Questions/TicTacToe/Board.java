package Questions.TicTacToe;

public class Board {
    Cell[][] grid;
    int n;

    Board(int n){
        this.n = n;
        grid = new Cell[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                grid[i][j] = new Cell(i,j);
            }
        }
    }

    public boolean placeMove(Move move){
        int row = move.r;
        int col = move.c;

        if(!grid[row][col].isEmpty()){
            return false;
        }

        Symbol curr = move.player.symbol;
        Cell cell = new Cell(row,col,curr);
        grid[row][col] = cell;
        return true;
    }

    public boolean checkWinner(Move move){

        int row = move.r;
        int col = move.c;

        Symbol symbol = grid[row][col].getSymbol();

        // row
        boolean win = true;

        for(int j = 0; j < n; j++){

            if(grid[row][j].getSymbol() != symbol){
                win = false;
                break;
            }
        }

        if(win) return true;

        // col
        win = true;

        for(int i = 0; i < n; i++){

            if(grid[i][col].getSymbol() != symbol){
                win = false;
                break;
            }
        }

        if(win) return true;

        // main diagonal
        if(row == col){

            win = true;

            for(int i = 0; i < n; i++){

                if(grid[i][i].getSymbol() != symbol){
                    win = false;
                    break;
                }
            }

            if(win) return true;
        }

        // anti diagonal
        if(row + col == n - 1){

            win = true;

            for(int i = 0; i < n; i++){

                if(grid[i][n-1-i].getSymbol() != symbol){
                    win = false;
                    break;
                }
            }

            if(win) return true;
        }

        return false;
    }
}
