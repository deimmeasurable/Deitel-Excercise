package Interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question {
    public static void main(String[] args) {
//        double[]number={2,3,4,0.5,6};
//        getSortedNumber(number);
        String  word="smooth";
//        getDuplicateValue(word);
        reverseWord(word);

    }
    public static List<Double> getSortedNumber(double[]value) {
        List<Double> result = new ArrayList<>();
        int valueIndex =Integer.MIN_VALUE;
        for (int i = 0; i < value.length; i++) {
            for (int j = i+1; j < value.length; j++) {
                if(value[i]>value[j]){
                    int sorted= (int) value[i];
                    value[i] = value[j];
                    value[j] = sorted;
                }
            }

        }
        for (int k = 0; k < value.length ; k++) {
            result.add(value[k]);
            if(value[k]>valueIndex){
                valueIndex= (int) value[k];
            }


        }
        System.out.println(valueIndex);

        System.out.println(result);
        return result;

    }
    public static String   getDuplicateValue(String word){
        word = word.trim();
        String  collection="";
        String[] value=word.split("\\+s");
        Map<Character,Integer> result=new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            if(result.containsKey(word.charAt(i))){
                int count=  result.get(word.charAt(i));
                result.put(word.charAt(i), ++count);
            }else {
                result.put(word.charAt(i),1);
                collection=result.toString();
            }

        }
        System.out.println(collection);
        return collection;
    }
    public static String reverseWord(String value) {
        value = value.trim().toLowerCase();

        String collect = "";
        for (int i = value.length()-1; i >= 0; --i) {
            collect = String.valueOf(value.charAt(i));

            System.out.print(collect);
        }
        return collect;
    }
}
