package selfPractise;

import java.util.Scanner;

public class ComputerAssistedInstruction {
    public static void main(String[] args) {


        ComputerAssistedInstruction computer = new ComputerAssistedInstruction();
        computer.createToIntegerForStudent();
    }
    public void createToIntegerForStudent() {
        Scanner input = new Scanner(System.in);
        int randomNumber1 = (int) (Math.random() * 12 + 1);
        int randomNumber2 = (int) (Math.random() * 12 + 1);
        System.out.println(randomNumber1 + " times " + randomNumber2);

        int total = 0;
        while (randomNumber1 != -1 || randomNumber2 != -1) {
            System.out.println("Enter the total value");
            total = input.nextInt();
            //   System.out.println(randomNumber1+" times "+ randomNumber2);

            if (randomNumber1 * randomNumber2 == total) {
                total = randomNumber1 + randomNumber2;
                System.out.println("very good");

            } else {
                System.out.println("no. please try again");
            }

        }

    }
        public int promptUser(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
        }
        public void allowUserToAttempt(int number){
            System.out.println("Enter a number 1 or 2 to quit");
            number=promptUser();

            switch(number) {
                case 1:
                    System.out.println("");
                    break;

                case 2: {
                    System.exit(0);
                }
            }
        }


}
