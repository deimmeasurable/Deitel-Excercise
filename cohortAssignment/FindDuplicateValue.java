package cohortAssignment;

import java.util.Locale;

public class FindDuplicateValue {
    public static void main(String[] args) {
        getDuplicatevalue();
    }
    public static String getDuplicatevalue() {
       String value = "InterLoop";
        value=value.toLowerCase(Locale.ROOT);
        StringBuilder collectvalue = new StringBuilder();
        for (int i=0; i<value.length(); i++){
            if(value.charAt(i)==value.charAt(i)){
                collectvalue.append(value.charAt(i));
            }
        }
        System.out.println(collectvalue);

        return String.valueOf(collectvalue);
    }
}
