package ChapterEleven;

import java.util.Arrays;
import java.util.Scanner;

import static ChapterEleven.TicTacToeBoard.*;

public class TicTacToe {
    public static String[][] game = {{EMPTY.name(), EMPTY.name(), EMPTY.name()},
            {EMPTY.name(), EMPTY.name(), EMPTY.name()},
            {EMPTY.name(), EMPTY.name(), EMPTY.name()}};


    private void printArray(){
        for (int i = 0; i < game.length; i++) {
            for (int j = 0; j < game[i].length; j++) {
                System.out.print(game[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public void getInput() {
        Scanner scanner = new Scanner(System.in);

        int firstPlayerIndex = 0;
        int secondPlayerIndex = 0;
        enterAnIndex(Arrays.deepToString(game));

        for (int i = 0; i <= 7; i++) {
            enterAnIndex("Enter 1 for index 1, Enter 2 for index 2," +
                    "Enter 3 for index 3, Enter 4 for index 4," +
                    "Enter 5 for index 5, Enter 6 for index 6, Enter 7 for index 7," +
                    "Enter 8 for index 8, Enter 9 for index 9");
            firstPlayerIndex = scanner.nextInt();
            {
                fillIndexWithValueXAndOInTicTacToeBoardForPlayerOne(firstPlayerIndex);
                printArray();

            }
            enterAnIndex("Enter 1 for index 1, Enter 2 for index 2," +
                    "Enter 3 for index 3, Enter 4 for index 4," +
                    "Enter 5 for index 5, Enter 6 for index 6, Enter 7 for index 7," +
                    "Enter 8 for index 8, Enter 9 for index 9");
            secondPlayerIndex = scanner.nextInt();{

                fillingOForSecondPlayer(secondPlayerIndex);
                printArray();
            }

        }
        }

    private void enterAnIndex(String s) {
        System.out.println(s);
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
                game[0][0] = String.valueOf(fillIndex);
            }

            case 2-> {
                game[0][1] =String.valueOf(fillIndex);
            }
            case 3-> {
                game[0][2] =String.valueOf(fillIndex);
            }
            case 4-> {
                game[1][0] =String.valueOf(fillIndex);
            }
            case 5-> {
                game[1][1] =String.valueOf(fillIndex);
            }
            case 6->{
                game[1][2] = String.valueOf(fillIndex);
            }
            case 7-> {
                game[2][0] = String.valueOf(fillIndex);
            }
            case 8-> {
                game[2][1] =String.valueOf(fillIndex);
            }
            case 9-> {
                game[2][2] = String.valueOf(fillIndex);
            }


        }
    }


    public static void main(String[] args) {
        TicTacToe tacToe=new TicTacToe();
        tacToe.getInput();


    }

}

