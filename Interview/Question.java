//package Interview;
//
//import java.util.*;
//
//public class Question {
//    public static void main(String[] args) {
////        double[]number={2,3,4,0.5,6};
////        getSortedNumber(number);
//        String  word="smooth";
////        getDuplicatedValue(word);
////        reversetheword(word);
//        double []  number= {9, 3, 4,  0.5};
//        int value=2;
//        removeAnIndexUmberInArray(number,value);
//
////        sort(number);
//
//    }
//    public static List<Double> getSortedNumber(double[]value) {
//        List<Double> result = new ArrayList<>();
//        int valueIndex =Integer.MIN_VALUE;
//        for (int i = 0; i < value.length; i++) {
//            for (int j = i+1; j < value.length; j++) {
//                if(value[i]>value[j]){
//                    int sorted= (int) value[i];
//                    value[i] = value[j];
//                    value[j] = sorted;
//                }
//            }
//
//        }
//        for (int k = 0; k < value.length ; k++) {
//            result.add(value[k]);
//            if(value[k]>valueIndex){
//                valueIndex= (int) value[k];
//            }
//
//
//        }
//        System.out.println(valueIndex);
//
//        System.out.println(result);
//        return result;
//
//    }
//    public static String   getDuplicateValue(String word){
//        word = word.trim();
//        String  collection="";
//        String[] value=word.split("\\+s");
//        Map<Character,Integer> result=new HashMap<>();
//
//        for (int i = 0; i < word.length(); i++) {
//            if(result.containsKey(word.charAt(i))){
//                int count=  result.get(word.charAt(i));
//                result.put(word.charAt(i), ++count);
//            }else {
//                result.put(word.charAt(i),1);
//                collection=result.toString();
//            }
//
//        }
//        System.out.println(collection);
//        return collection;
//    }
//    public static String reverseWord(String value) {
//        value = value.trim().toLowerCase();
//
//        String collect = "";
//        for (int i = value.length()-1; i >= 0; --i) {
//            collect = String.valueOf(value.charAt(i));
//
//            System.out.print(collect);
//        }
//        return collect;
//    }
//    public static String  getDuplicatedValue(String value) {
//        value = value.trim();
//        String[] collect = value.split("\\+s");
//
//        Map<Character, Integer> contain = new HashMap<Character, Integer>();
//
//        String collection = "";
//        for (int i = 0; i < value.length(); i++) {
//            if (contain.containsKey(value.charAt(i))) {
//                int count = contain.get(value.charAt(i));
//                contain.put(value.charAt(i), ++count);
//            } else {
//                contain.put(value.charAt(i), 1);
//                collection = contain.toString();
//            }
//
//        }
//        System.out.println(collection);
//        return collection;
//
//    }
//    public static String reversetheword(String word) {
//        word = word.trim();
//
//        String collect = "";
//        for (int i = word.length() - 1; i >= 0; --i) {
//            collect = String.valueOf(word.charAt(i));
//            System.out.print(collect);
//
//        }
//        return collect;
//    }
//    public static int sort(int[] value){
//
//        int highestValue =Integer.MIN_VALUE;
//
//
//           Arrays.sort(value);
//
//           for (int i = 0; i < value.length; i++) {
//               if(value[i] > highestValue){
//                   highestValue=value[i];
//               }
//
//        }
//        System.out.println(highestValue);
//        System.out.println(Arrays.toString(value));
//        return highestValue;
//
//    }
//    public static List<Double> removeAnIndexUmberInArray(double[]number,int value){
//        List<Double> list = new ArrayList<>();
//        list.add((double) number.length);
//        for (int i = 0; i < number.length; i++) {
//           if(number[i]==number[3]){
//               number[i] = value;
//           }
//           list.add(number[i]);
//
//        }
//        System.out.println(list);
//        return  list;
//
//    }
//
//
//    public static List<Double> removeAnIndexUmberInArray(double[]number,int value){
//        List<Double> list = new ArrayList<>();
//        list.add((double) number.length);
//        for (int i = 0; i < number.length; i++) {
//           if(number[i]==number[3]){
//               number[i] = value;
//           }
//           list.add(number[i]);
//
//        }
//        System.out.println(list);
//        return  list;
//
//    }
//    public static String    getDuplicate(String word){
//        word = word.trim();
//        String  collection="";
//        Map<Character,Integer>collect=new HashMap<>();
//            int highestValue=Integer.MIN_VALUE;
//           for (int i = 0; i < value.length; i++) {
//               if(value[i] > highestValue){
//                   highestValue=value[i];
//               }
//
//        }
//        System.out.println(highestValue);
//        System.out.println(Arrays.toString(value));
//        return value;
//
//    }
//    public static List<Double> removeAnIndexUmberInArray(double[]number,int value){
//        List<Double> list = new ArrayList<>();
//        list.add((double) number.length);
//        for (int i = 0; i < number.length; i++) {
//           if(number[i]==number[3]){
//               number[i] = value;
//           }
//           list.add(number[i]);
//
//        }
//        System.out.println(list);
//        return  list;
//
//    }
//    public static String    getDuplicate(String word){
//        word = word.trim();
//        String  collection="";
//        Map<Character,Integer>collect=new HashMap<Character,Integer>();
//        for (int i = 0; i <word.length(); i++) {
//            if(collect.containsKey(word.charAt(i))) {
//                int count = collect.get(word.charAt(i));
//                collect.put(word.charAt(i), ++count);
//
//            }else {
//                collect.put(word.charAt(i),1);
//                collection=collect.toString();
//
//            }
//        }
//        System.out.println(collection);
//        for (int i = 0; i <word.length(); i++) {
//            if(collect.containsKey(word.charAt(i))) {
//                int count = collect.get(word.charAt(i));
//                collect.put(word.charAt(i), ++count);
//
//            }else {
//                collect.put(word.charAt(i),1);
//                collection=collect.toString();
//
//            }
//        }
//        System.out.println(collection);}
//    public static String    getDuplicate(String word){
//        word = word.trim();
//        String  collection="";
//        Map<Character,Integer>collect=new HashMap<Character,Integer>();
//        for (int i = 0; i <word.length(); i++) {
//            if(collect.containsKey(word.charAt(i))) {
//                int count = collect.get(word.charAt(i));
//                collect.put(word.charAt(i), ++count);
//
//            }else {
//                collect.put(word.charAt(i),1);
//                collection=collect.toString();
//
//            }
//        }
//        System.out.println(collection);
//        return  collection;
//    }
//
//}
//}