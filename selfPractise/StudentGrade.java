package selfPractise;

import java.util.Scanner;

public class StudentGrade {
    private static Scanner scan =new Scanner(System.in);

    public static  void StudentName(String name){
        System.out.println("enter your name");
        name =scan.nextLine();


    }
    public static void StudentRate(){
        int Score = 0;
      int  gradeCounter=0;
      int total=0;
      int totalStudent;

      do {
         // StudentName("name");
          System.out.println("Enter a score");
          int score=scan.nextInt();
           score = 0;
          if(score>90){
              System.out.println("The studentGrade is"+"A");
              total+=score;
              System.out.println("The total student with this "+total);
          }
            if(score <= 80){
                (score>70) {
                    System.out.println("The studentGrade is" + "B");
                }
                   //System.out.println(score);
          }
          if (score<60){
              System.out.println("the StudentGrade is"+"c");

          }
           if (Score <= 40){
              System.out.println("the StudentGrade is"+"D");

          }
          gradeCounter++;
      }
      while (gradeCounter<5);
    }
    public static void display(){
        StudentName("name");
        StudentRate();
    }
}
