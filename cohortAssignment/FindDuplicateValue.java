package cohortAssignment;

import java.util.Locale;

public class FindDuplicateValue {
    public static void main(String[] args) {
        getDuplicateValue();
    }
    public static String getDuplicateValue() {
       String value = "InterLoop";
        value=value.toLowerCase(Locale.ROOT);
        StringBuilder collectValue = new StringBuilder();
        for (int i=0; i  <value.length(); i++){
            if(value.charAt(i)==value.charAt(i)){
                collectValue.append(value.charAt(i));
            }
        }
        System.out.println(collectValue);

        return String.valueOf(collectValue);
    }
}
