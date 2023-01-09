package cohortAssignment;

public class FindNumberInAnArray {
    public static void main(String[] args) {



            // write your code in Java SE 8
            int value = 10;
            int indexVal = 0;
  int [] A=new int[]{1,3,6,4,1,2};
            for (int i = 0; i <= A.length-1; i++) {
                if (A[i] == value && A[i]-1 ==value) {
                    indexVal = A[i];
                    System.out.println(indexVal);

                }

            }

        }

        }







