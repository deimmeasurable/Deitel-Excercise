package selfPractise;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        printingTriangle();
    }


    public static void printingTriangle() {
        Scanner scan = new Scanner(System.in);
        String[] number = new String[]{"*", "*", "*", "*", "*", "*", "*","*","*","*"};
        int counter = 0;
        number= new String[]{"*", "*", "*", "*", "*", "*", "*","*","*","*"};
        for ( int a =1 ; a <= number.length; a++) {
            for (int i = 1; i <=a; i++) {


                System.out.print(" * ");

            }
            System.out.println();
        }

    }

}
