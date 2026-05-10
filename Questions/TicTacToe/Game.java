package Questions.TicTacToe;

import java.util.List;
import java.util.Scanner;

public class Game {
    int turn = 0;
    Scanner sc = new Scanner(System.in);

    public void start(int size){

        Board b = new Board(size);

        while(true){

            String name = Main.players.get(turn).name;
            System.out.println(name + "'s turn");

            System.out.println("Enter row & col in which u want to place your symbol");
            int r = sc.nextInt();
            int c = sc.nextInt();
            System.out.println("Enter symbol from [X,O]");
            String input = sc.next().toUpperCase();

            try {
                Symbol s = Symbol.valueOf(input);
                Player currentPlayer = Main.players.get(turn);
                Move move = new Move(r,c,currentPlayer);

                boolean res = b.placeMove(move);
                if(!res) System.out.println("Invalid move! Try again");
                boolean ans = b.checkWinner(move);
                if(ans){
                    System.out.println(move.player.name + " is the winner");
                    break;
                }
                turn = (turn + 1) % Main.players.size();
            }
            catch (IllegalArgumentException e) {
                System.out.println("Invalid symbol! Enter again");
            }
        }
    }
}
