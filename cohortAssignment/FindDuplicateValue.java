package cohortAssignment;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateValue {
    public static void main(String[] args) {
//        getDuplicateValue();
//    }
//    public static void getDuplicateValue() {
//        int count = 0;
//       String value = "InterrLoop p";
//        value=value.toLowerCase(Locale.ROOT);
//        char[] values =value.toCharArray();
//        StringBuilder collectValue = new StringBuilder();
//        for (int i=0; i  <value.length(); i++) {
//
//            for (int j = i+1; j < value.length(); j++) {
//                count++;
//                if (values[i]==values[j] ) {
//                    collectValue.append(values[j]);
//                    System.out.println(collectValue);
//
////
//                   break;
//                }

//            }


//        }
        String str = "The quick brown fox jumps over the lazy dog.";


         str.split("\\s+");
        // Create a set to store the duplicate characters
        Set<Character> duplicates = new HashSet<>();

        // Create a set to store the unique characters
        Set<Character> uniques = new HashSet<>();

        // Find the duplicate characters
        for (char c : str.toCharArray()) {
            if (!uniques.add(c)) {
                duplicates.add(c);
            }
        }

        // Print the duplicate characters
        System.out.println("Duplicate characters: " + duplicates);



   }

}
