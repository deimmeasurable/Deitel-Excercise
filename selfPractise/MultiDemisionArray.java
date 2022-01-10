package selfPractise;

public class MultiDemisionArray {

    public static void main(String[] args) {
        int [][] number={{1,2,3},{4,5,6},{7,8,9}};

        for (int row = 0; row <number.length ; row++) {
            for (int column = 0; column <number[row].length ; column++) {
                System.out.print(number[row][column]+" ");

            }
            System.out.println();
        }
    }

}
