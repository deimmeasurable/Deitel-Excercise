package cohortAssignment;

import java.util.*;

public class FindNumberInAnArray {
    public static void main(String[] args) {
        String word = "deed";

//        reverseAString(word);
//getDuplicateWord(word);
        //       countOfWords(word);
        //      fibonacciSeries(10);
        int[] number = new int[]{2, 1, 0, 5};
        //       reverseAnInteger(number);
        //     sortAnArray(number);
     //   isPalindrome(word);
        int num=100;
        getPrimeNumber(num);
    }

    // write your code in Java SE 8
//            int value = 10;
//            int indexVal = 0;
//  int [] A=new int[]{1,3,6,4,1,10};
//            for (int i = 0; i < A.length; i++) {
//                if (A[i] == value) {
//                    indexVal = A[i];
//                    System.out.println(indexVal);
//
//                }
//
//            }

    //        }
    public static String reverseAString(String word) {
        String collection = "";
        for (int i = word.length() - 1; i >= 0; --i) {
            collection = String.valueOf(word.charAt(i));
            System.out.print(collection);
        }

        return collection;

    }

    public static String getDuplicateWord(String word) {
        Map<Character, Integer> collection = new HashMap<>();
        String value = "";
        for (int i = 0; i < word.length(); ++i) {
            if (collection.containsKey(word.charAt(i))) {
                int count = collection.get(word.charAt(i));
                collection.put(word.charAt(i), ++count);
            } else {
                collection.put(word.charAt(i), 1);
                value = collection.toString();
            }

        }
        System.out.println(value);
        return value;
    }

    public static String countOfWords(String word) {
        String[] collectWord = word.split("");
        Map<String, Integer> value = new HashMap<>();
        for (String collection : collectWord) {
            value.merge(collection, 1, Integer::sum);


        }
        String collectValue = value.toString();
        System.out.println(collectValue);
        return collectValue;
    }

    public static List<Integer> fibonacciSeries(int number) {
        ArrayList<Integer> value = new ArrayList<>();
        int number2 = 1;
        int count = 0;
        int temp = 0;

        while (count < number) {

            temp = number + number2;
            number = number2;
            number2 = temp;
            value.add(number);

        }
        System.out.println(value);
        return value;

    }

    public static List<Integer> reverseAnInteger(int[] number) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = number.length - 1; i >= 0; --i) {
            list.add(number[i]);
            System.out.println(list);
        }
        return list;
    }

    public static List<Integer> sortAnArray(int[] number) {
        int maxValue = Integer.MIN_VALUE;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < number.length; i++) {
            if (number[i] > maxValue) {
                maxValue = number[i];

            }


            Arrays.sort(number);
            list.add(number[i]);
        }
        System.out.println(maxValue);
        System.out.println(list);
        return list;
    }

    public static boolean isPalindrome(String word) {
        String[] value = word.split("//+");

        String collectValue = " ";
        for (int i = value.length - 1; i >= 0; --i) {
//            collectValue = String.valueOf(word.charAt(i));
//            System.out.print(collectValue);


            if (value[i].charAt(0) == value[i].charAt(value[i].length() - 1)) {
                String palindrome = String.valueOf(value[i]);

                System.out.print(palindrome + "  it a palindrome");
                return true;
            } else {
                String notPalindrome = String.valueOf(value[i]);
                System.out.print(notPalindrome + "  it's not a palindrome");
                return false;

            }


        }
        System.out.print("it's not a palindrome");
        return false;

    }

    public static List<Integer> getPrimeNumber(int number) {
        ArrayList<Integer> value = new ArrayList<>();

        for (int i = 2; i < number - 1; ++i) {
            if (isPrime(i)) {
                value.add(i);
            }
        }
        System.out.println(value);
        return value;
    }

    private static boolean isPrime(int number) {
        int remainder;
        for (int count = 2; count < number - 1; ++count) {
            remainder = number % count;
            if (remainder == 0) {
                return false;


            }

        }
        return true;
    }
}









