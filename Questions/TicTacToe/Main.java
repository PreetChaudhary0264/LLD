package Questions.TicTacToe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//orr behtar design ho skta hai jaise symbols input mat lo wo already players ko dedo and checkwinner me full iteration hora hai but 60 min me optimize expect nhi kr skte
//and bot ka feature bhi de skte hai player class ko abstrat bnake ek method dedo makemove (bot random number se kaam krega).
public class Main {
     static List<Player> players;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the grid");
        int size = sc.nextInt();
        System.out.println("Enter player 1 name");
        String name1 = sc.next();

        System.out.println("Enter player 2 name");
        String name2 = sc.next();

        players = new ArrayList<>();

        players.add(new Player(name1,Symbol.X));
        players.add(new Player(name2,Symbol.O));

        Game game = new Game();
        game.start(3);
    }
}
