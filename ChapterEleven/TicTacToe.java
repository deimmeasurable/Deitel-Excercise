package ChapterEleven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static ChapterEleven.TicTacToeBoard.*;

public class TicTacToe {
    public static TicTacToeBoard [] [] game={{EMPTY,EMPTY,EMPTY},
            {EMPTY,EMPTY,EMPTY},
            {EMPTY,EMPTY,EMPTY}};

    List<Attempt> player2Attempt = new ArrayList<>();
    List<Attempt> player1Attempt = new ArrayList<>();

    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        String index;
        String value;
        int currentPlayer = 0;
        int firstPlayer = 0;
        int secondPlayer = 0;
        System.out.println(Arrays.deepToString(game));

        for (int i = 0; i <= 8; i++) {
            System.out.println("Enter 1 for index 1, Enter 2 for index 2," +
                    "Enter 3 for index 3, Enter 4 for index 4," +
                    "Enter 5 for index 5, Enter 6 for index 6, Enter 7 for index 7," +
                    "Enter 8 for index 8, Enter 9 for index 9");
            index = scanner.nextLine();
//            System.out.println("Enter x or 0");
//            value = scanner.nextLine();
            if (currentPlayer == 0){
                Attempt attempt = new Attempt();
               TicTacToePlayer player = new TicTacToePlayer();
               player.setName("player1");
               attempt.setPlayer(player);
               attempt.setGameIndex(index);
               attempt.setGameIndexValue(X);
               fillIndexWithValueXAndOInTicTacToeBoard(X);

               firstPlayer++;

                System.out.println("firstPlayer play"+firstPlayer);


//               if (value.equals("x")){
//                   attempt.setGameIndexValue(TicTacToeBoard.X);
//               }
//               else {
//                   attempt.setGameIndexValue(TicTacToeBoard.O);
//               }
               this.player1Attempt.add(attempt);
               currentPlayer = 1;
            }
           else if(currentPlayer==1){
                Attempt attempt = new Attempt();
                TicTacToePlayer playerTwo = new TicTacToePlayer();
                playerTwo.setName("player2");
                attempt.setPlayer(playerTwo);
                attempt.setGameIndex(index);
                attempt.setGameIndexValue(O);
                fillIndexWithValueXAndOInTicTacToeBoard(O);
                secondPlayer++;
                System.out.println("secondPlayer play"+secondPlayer);
//                if(value.equals("x")){
//                    attempt.setGameIndexValue(TicTacToeBoard.O);
//                }
//                else{
//                    attempt.setGameIndexValue(TicTacToeBoard.X);
//                }
                this.player2Attempt.add(attempt);
                currentPlayer = 0;
            }


        }


    }
    public void fillIndexWithValueXAndOInTicTacToeBoard(Attempt index,TicTacToeBoard value) {
//        for (int row = 0; row < game.length ; row++) {
//            for (int column = 0; column < game.length; column++) {

        if (index.equals("1")) {
            value=game[0][0];
        }
        if (value == 2) {
            TicTacToeBoard ticTacToeBoard = game[0][1];
        }
        if (value == 3) {
            TicTacToeBoard ticTacToeBoard = game[0][2];
        }
        if (value == 4) {
            TicTacToeBoard ticTacToeBoard = game[1][0];
        }
        if (value == 5) {
            TicTacToeBoard ticTacToeBoard = game[1][1];
        }
        if (value == 6) {
            TicTacToeBoard ticTacToeBoard = game[1][2];
        }
        if (value == 7) {
            TicTacToeBoard ticTacToeBoard = game[2][0];
        }
        if (value == 8) {
            TicTacToeBoard ticTacToeBoard = game[2][1];
        }
        if (value == 9) {
            TicTacToeBoard ticTacToeBoard = game[2][2];
        }


////                value=game[row][column];
////                System.out.println(value);
////    break;
//            }
//        }

    }

    public static void main(String[] args) {
        TicTacToe tacToe=new TicTacToe();
        tacToe.getInput();
        System.out.println(Arrays.deepToString(game));

    }

}
