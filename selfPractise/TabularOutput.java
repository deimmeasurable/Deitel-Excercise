package selfPractise;

import java.util.Scanner;

public class TabularOutput {
    public static void main(String[] args) {
        display();
    }




    public static void display(){
        Scanner scan = new Scanner(System.in);
int []number = new int[]{1,2,3,4,5};
        System.out.println("N    N2   N3    N4");

        for (int i = 0; i<=number.length; i++) {
            System.out.println(number[i]);
            //System.out.println( "\n" +(int) Math.pow(2,3));
            //System.out.print(i);

        }
}
}