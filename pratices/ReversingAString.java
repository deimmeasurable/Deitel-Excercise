package pratices;

import java.util.*;

public class ReversingAString {
    public static  void main(String[] args){
        String word="noon";
      //  isPalindrome(word);
        int [] number= new int[]{1,4,2,3};
        //reverseAInteger(number);

       // sortAnArray(number);
       // reverseAInteger(number);
       // sortAnArrays(number);
        int[] num =new int[]{7,8,5,6,4};
        //reverseAnIntegers(num);

        //isAPalindromes(word);
       // reverse(word);
        //reverseInteger(num);
        //palindrome(word);

        int numbers=10;
        //getPrimeNumber(100);
       // sortArray(num);
        listOfValue(numbers);

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


    public static String reverseAStrings(String word) {
        String collection = "";
        for (int i = word.length() - 1; i >= 0; --i) {
            collection = String.valueOf(word.charAt(i));

        }
        return collection;
    }
    public static List<Integer> getListOfNumebers(int num){
        List<Integer> collect=new ArrayList<>();
        int number1=1;
        int count=0;
        while(count < num){
            int value=num + number1;
            num=number1;
            number1=value;

        }
        collect.add(num);

        return collect;


    }
    public static String getDuplicateValues(String word){
        Map<Character,Integer> value=new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            if(value.containsKey(word.charAt(i))){
                int count= value.get(word.charAt(i));
                value.put(word.charAt(i), ++count);
            }else{
                value.put(word.charAt(i),1);
            }


        }
        return value.toString();
    }
    public static String countNumberOfWord(String[] word){
        Map<String,Integer> values = new HashMap<String,Integer>();

        for (String collect:word) {
            values.merge(collect,1,Integer::sum);

        }
        return values.toString();
    }
    public static List<Integer> sortAnArrays(int [] number) {
        List<Integer> list = new ArrayList<Integer>();
        int maxValue= Integer.MIN_VALUE;

        for(int i=0; i<number.length;i++){
            if(number[i]>maxValue){
                maxValue=number[i];

            }
            Arrays.sort(number);
            list.add(number[i]);
        }
        System.out.println(maxValue);
        System.out.println(list);
        return list;

    }
    public static List<Integer> reverseAnIntegers(int[] number){
        List<Integer> value=new ArrayList<>();

        for(int i=number.length-1; i>=0; --i){
            value.add(number[i]);

        }
        System.out.println(value);
        return value;
    }
    public static  boolean isAPalindromes(String word) {
      String [] values = word.split("//+");
        String collect = "";
        for (int i = 0; i < values.length; i++) {
            if (values[i].charAt(0) == values[i].charAt(values.length)-1){
                collect = values[i];
                System.out.println(collect + "it is a palindrome");
                return true;
            } else {

                collect= values[i];
                System.out.println(collect + "it is not a palindrome");
                return false;
            }

        }


        return false;
    }
    public static String reverse(String word){
        String collect="";
        for(int i =word.length()-1; i>=0; --i){
            collect = String.valueOf(word.charAt(i));
            System.out.print(collect);

        }

        return collect;
    }
    public static List<Integer> reverseInteger(int [] num){

        List<Integer> value = new ArrayList<>();
        for(int i=num.length-1; i>=0; --i){
            value.add(num[i]);
            System.out.println(value);

        }
        return value;
    }
    public static boolean palindrome(String word){
        String[] value= word.split("//+");

        String collect="";

        for(int i=0;i< value.length;i++){
            if(value[i].charAt(0)==value[i].charAt(value.length)-1){
                collect =value[i];
                System.out.println(collect + "it is a palindrome");
                return true;
            }
            else {
                collect=value[i];
                System.out.println(collect +"it is not palindrome");
                return false;
            }
        }
        return false;
    }
    public  static  List<Integer> getPrimeNumber(int number){
        List<Integer> value = new ArrayList<>();
        for(int i=2;i<number-1;i++){
            if(isPrime(i)){
                value.add(i);

            }
        }
        System.out.println(value);
        return  value;
    }
    private static boolean isPrime(int number){
        int remainder = 0;
        int num =2;
        for(int i=2;i<number-1;i++){
            if(number % num == 0){
                remainder=number;
                return true;
            }
        }
        return false;

        }
        private static List<Integer>sortArray(int [] number){
        int max=Integer.MIN_VALUE;
        List<Integer> value =new ArrayList<>();

        for(int i=0; i<number.length;i++){
            if(number[i]>max){
                max=number[i];

            }
            Arrays.sort(number);
            value.add(number[i]);

        }
            System.out.println(max);
            System.out.println(value);
        return value;

        }
        private static List<Integer> listOfValue(int number){
        int number2=1;
        int count=0;

        List<Integer> value= new ArrayList<>();

        while (count < number){
            int number3=number + number2;
            number=number2;
            number2=number3;

            value.add(number);


        }
            System.out.print(value);
        return value;
        }
    }



