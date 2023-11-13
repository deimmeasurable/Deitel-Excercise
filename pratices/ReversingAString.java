package pratices;

import java.util.*;

public class ReversingAString {
    public static  void main(String[] args){
        String word="noon";
      //  isPalindrome(word);
        int [] number= new int[]{1,4,2,3};
        //reverseAInteger(number);

       // sortAnArray(number);
        reverseAInteger(number);

    }
    public static String reversingAString(String word) {
        String collection = "";
        for (int i = word.length() - 1; i >= 0; --i) {
            collection = String.valueOf(word.charAt(i));
        }
        return collection;
    }
    public  static String getADuplicateString(String word) {
        Map<Character, Integer> value = new HashMap<>();
        String collect = "";
        for (int i = 0; i < word.length(); i++) {
            if (value.containsKey(word.charAt(i))) {
                int count = value.get(word.charAt(i));
                value.put(word.charAt(i), ++count);

            } else {
                value.put(word.charAt(i), 1);
                collect = value.toString();
            }

        }
        return collect;

    }
    public  static  String countNumberOfWords(String word){
        String [] value=word.split("//+");
        Map<String, Integer> collect = new HashMap<>();

        for (String collection:value) {
            collect.merge(collection,1,Integer::sum);


        }
        return collect.toString();
    }
    public static List<Integer> getListNumber(int number){
        List<Integer> value= new ArrayList<Integer>();
        int num2=1;
        int count=0;

        while(count < number){
            int temp=number + num2;
            number=num2;
            num2=temp;
            value.add(number);
        }
         return value;

    }
    public static boolean isPalindrome(String word) {
        String[] value = word.split("//+");

        String collection = "";
        int i;
        for (i = 0; i < value.length; ++i) {
            if (value[i].charAt(0) == value[i].charAt(value.length) - 1) {
                collection = value[i];
                System.out.println(collection + " it is a palindrome");
                return true;
            }else {


                collection = value[i];
                System.out.println(collection + " it is not a palindrome");
                return false;
            }
        }
        return false;

    }
    public static List<Integer> reverseAInteger(int [] number){
        List<Integer> result = new ArrayList<>();

        for(int i = number.length-1; i >=0;--i){
            result.add(number[i]);

        }
        System.out.println(result);
        return result;

    }
    public static int getMaxNumber(int [] number){
        List<Integer> result = new ArrayList<>();
        int maxNumber=Integer.MIN_VALUE;

        for (int i=0; i<number.length;++i){
            if(number[i] > maxNumber){
                maxNumber=number[i];
                System.out.println(maxNumber);
            }
            Arrays.sort(number);
            System.out.println(number);

        }
        return maxNumber;
    }
    public  static String reverseAstring(String word) {
        String collect = "";
        for (int i = word.length() - 1; i >= 0; --i) {
            collect = String.valueOf(word.charAt(i));
        }
        return collect;
    }
    public static List<Integer> getListOfNumber(int number){
        int secondNumber=1;
        List<Integer> value=new ArrayList<>();
        int count=0;
        while(count > number){
            int temp=number + secondNumber;
            number=secondNumber;
            secondNumber=temp;
            value.add(number);
        }
        return  value;

    }
    public static String getDuplicateValue(String word){
        Map<Character,Integer> value=new HashMap<>();

        for(int i=0;i< word.length();++i){
            if(value.containsKey(word.charAt(i))){
                int count=value.get(word.charAt(i));
                value.put(word.charAt(i),++count);
            }
            else{
                value.put(word.charAt(i),1);
            }
        }
        return value.toString();
    }
    public static String countNumberOfWords(String[] word){
        Map<String, Integer> value= new HashMap<>();

        for(String collect : word){
            value.merge(collect,1,Integer::sum);

        }
        return value.toString();
    }

    public static String reverseAString(String word) {
        String collect = null;
        for (int i = word.length() - 1; i >= 0; --i) {
            collect = String.valueOf(word.charAt(i));
        }
        return collect;
    }
    public static String getDuplicateWord(String word) {
        Map<Character, Integer> value = new HashMap<>();

        String collect = "";
        for (int i = 0; i < word.length(); ++i) {
            if (value.containsKey(word.charAt(i))) {
                int count = value.get(word.charAt(i));
                value.put(word.charAt(i), ++count);
            } else {
                value.put(word.charAt(i), 1);
                collect = value.toString();
            }
        }
        return collect;
    }
    public static String countLstOfWord(String[] word){
        Map<String,Integer> value =new HashMap<String,Integer>();

        for(String collect : word){
            value.merge(collect,1,Integer::sum);
        }
        return value.toString();
    }
    public static List<Integer> sortAnArray(int [] number) {
        List<Integer> value = new ArrayList<Integer>();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < number.length; ++i) {
            if (number[i] > max) {
                max = number[i];

            }
            Arrays.sort(number);
            value.add(number[i]);


        }
        System.out.println(max);
        System.out.println(value);

        return value;

    }
    public static List<Integer> reverseAnInteger(int [] number){
        List<Integer> values = new ArrayList<Integer>();

        for(int i=number.length-1; i>=0;--i){
            values.add(number[i]);
        }
        System.out.println(values);
        return values;
    }


}
