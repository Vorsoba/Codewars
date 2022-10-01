
import java.util.regex.Pattern;

public class PigLatin {          // https://www.codewars.com/kata/520b9d2ad5c005041100000f/train/java

    public static String pigIt(String str) {

        String[] output = str.split("\\s+");
        String pigLanguage = "";
        String pig = " ";
        String ay = "ay";
//      Pattern special = Pattern.compile("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
        for (String s : output) {
            if (!s.equals("!") && !s.equals("?")) {
//            if (!s.equals(special)) {

                String partOfWord = s.substring(1);
                String createString = partOfWord + s.charAt(0) + ay + pig;
                pigLanguage += createString;
            } else {
                String createString = s.charAt(0) + pig;
                pigLanguage += createString;
            }
        }

        StringBuilder fin = new StringBuilder(pigLanguage);

        return fin.deleteCharAt(fin.length() - 1).toString();
    }

    public static void main(String[] args) {
        String str = "Pig latin is cool !";
        System.out.println(pigIt(str));

    }
}