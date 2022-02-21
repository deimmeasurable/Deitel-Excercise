package ChapterEleven;

import java.util.Arrays;
import java.util.Scanner;

import static ChapterEleven.TicTacToeBoard.*;

public class TicTacToe {
    private static TicTacToeBoard[][] game = new TicTacToeBoard[3][3];

    private void resetGame(){
        for (int row = 0; row < game.length; row++){
            for (int col = 0; col < game[row].length; col++){
                game[row][col] = EMPTY;
            }
        }
    }



    private String printArray(){
        StringBuilder display = new StringBuilder();
        for (TicTacToeBoard[] ticTacToeBoards : game){
            for (TicTacToeBoard board : ticTacToeBoards){
                switch (board){
                    case EMPTY -> display.append("  ");
                    case X -> display.append(" X ");
                    case O -> display.append(" O ");
                }
            }
            display.append("\n");
        }
        return display.toString();
    }

    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        int []collectionFirstPlayerInput=new int[5];
        int [] collectionSecondPlayerInput=new int[5];
        int firstPlayerIndex = 0;
        int secondPlayerIndex = 0;
        enterAnIndex(Arrays.deepToString(game));

        for (int i = 0; i <= 4; i++) {
            enterAnIndex("Enter 1 for index 1, Enter 2 for index 2," +
                    "Enter 3 for index 3, Enter 4 for index 4," +
                    "Enter 5 for index 5, Enter 6 for index 6, Enter 7 for index 7," +
                    "Enter 8 for index 8, Enter 9 for index 9");


            firstPlayerIndex = scanner.nextInt();
//            if (isempty(firstPlayerIndex))System.out.println("nigga enter correct tins!!invalid input");

            {
                fillIndexWithValueXAndOInTicTacToeBoardForPlayerOne(firstPlayerIndex);
                System.out.println(printArray());

                collectionFirstPlayerInput[i] = firstPlayerIndex;
                System.out.println(Arrays.toString(collectionFirstPlayerInput));

                    checkWin(game);

            }

            enterAnIndex("Enter 1 for index 1, Enter 2 for index 2," +
                    "Enter 3 for index 3, Enter 4 for index 4," +
                    "Enter 5 for index 5, Enter 6 for index 6, Enter 7 for index 7," +
                    "Enter 8 for index 8, Enter 9 for index 9");
            secondPlayerIndex = scanner.nextInt();
//            if (isempty(secondPlayerIndex)) {

                fillingOForSecondPlayer(secondPlayerIndex);
            System.out.println(printArray());
                collectionSecondPlayerInput[i] = secondPlayerIndex;
                System.out.println(Arrays.toString(collectionSecondPlayerInput));
            }

        checkWin(game);

        }




    private boolean isempty(int index) {
        for (int row = 0; row < game.length; --row) {
            for (int column = 0; column < game[row].length; column++) {


                game.equals(index);
            }

            return false;

        }
        return false;
    }

    private void enterAnIndex(String message) {
        System.out.println(message);
    }


    public void fillIndexWithValueXAndOInTicTacToeBoardForPlayerOne(int value) {

        fillPlayerValue(value, X);
    }

 public void fillingOForSecondPlayer(int value) {

     fillPlayerValue(value, O);
 }

    private void fillPlayerValue(int value, TicTacToeBoard fillIndex) {
        switch (value) {
            case 1-> {
                game[0][0] = fillIndex;
            }

            case 2-> {
                game[0][1] =fillIndex;
            }
            case 3-> {
                game[0][2] =fillIndex;
            }
            case 4-> {
                game[1][0] =fillIndex;
            }
            case 5-> {
                game[1][1] =fillIndex;
            }
            case 6->{
                game[1][2] = fillIndex;
            }
            case 7-> {
                game[2][0] = fillIndex;
            }
            case 8-> {
                game[2][1] =fillIndex;
            }
            case 9-> {
                game[2][2] = fillIndex;
            }


        }

    }

    public void checkWin(TicTacToeBoard[][] game){
        if (checkColumnWin(game)){
            System.out.println("You won");
        }else {
            System.out.println("====================");
        }
    }

    private boolean checkColumnWin(TicTacToeBoard[][] game) {
        for (int row = 0; row < game.length; row++){
           if ((game[row][0] == X) && (game[row][1] == X) && (game[row][2]==X))
               return false;
        }
        return true;
    }


    public static void main(String[] args) {
        TicTacToe tacToe=new TicTacToe();
        tacToe.resetGame();
        tacToe.getInput();



    }

}

