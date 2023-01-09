package ChapterFifteen;

public class ReversingAString {

    public static void main(String[] args) {
        String word = "GROOM";
//        reserveAString(word);
    }
//    public static void reservingAString(String word){
//        word=word.toLowerCase();
//        StringBuilder collect = new StringBuilder();
//        for(int i=word.length()-1; i>=0; i--){
//            collect.append(word.charAt(i));
//
//        }
//        System.out.println(collect);
//
//    }

    public  String reserveAString(String word){
        word=word.toLowerCase();
        StringBuilder s = new StringBuilder();
        for (int i = word.length()-1; i >=0 ; i--) {
            s.append(word.charAt(i));



        }
//        System.out.println(s);
        return s.toString();
    }
}