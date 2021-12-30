package selfPractise;

import java.util.Scanner;

public class Cryptography {

    public static void main(String[] args) {
        collectionOfDigit();
    }

    public static void collectionOfDigit() {
        Scanner scan = new Scanner(System.in);
        int firstDigit = 0;
        int secondDigit = 0;
        int thirdDigit = 0;
        int fourDigit = 0;
        int number;
        System.out.println("enter a number");
        number = scan.nextInt();

        firstDigit = number / 1000;
        number = number + 7 % 10;
        System.out.println("The value of firstnumber is " + firstDigit);

        secondDigit = (number % 1000) / 100;
        number = number + 7 % 10;
        System.out.println("the value of secondNumber is " + secondDigit);

        thirdDigit = (number % 100) / 10;
        number +=  7 % 10;
        System.out.println("The value of thirdNumber is " + thirdDigit);

        fourDigit = (number % 10);
        number = number + 7;
                fourDigit=fourDigit% 10;
        System.out.println("the value of fourNumber is  " + fourDigit);

        if (firstDigit == thirdDigit) {
            if (secondDigit == fourDigit) {
                System.out.println("It is an encrypt");
            }
        }
        if (firstDigit != thirdDigit) {
            if (secondDigit != fourDigit) {
                System.out.println("it is not encrypt");
            }
        }

    }
}
