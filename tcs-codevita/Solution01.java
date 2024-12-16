import java.util.ArrayList;
import java.util.List;

/**
 * Write a code to find the number of vowels and non-vowels in chatbox (string).
 */

public class Solution01 {

    static char[] vowels = new char[] { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };

    public static boolean isVowel(char ch) {
        for (int i = 0; i < vowels.length; i++) {
            if (ch == vowels[i]) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNotSpecialCharacter(char ch) {
        return (ch != ' ' && ch != ',' && ch != '.' && ch != '!' && ch != '?' && ch != ';' && ch != ':' && ch != '-'
                && ch != '/' && ch != '@' && ch != '#' && ch != '$' && ch != '%' && ch != '^' && ch != '&' && ch != '*'
                && ch != '(' && ch != ')' && ch != '[' && ch != ']' && ch != '{' && ch != '}' && ch != '|' && ch != '~'
                && ch != '`' && ch != '1' && ch != '2' && ch != '3' && ch != '4' && ch != '5' && ch != '6' && ch != '7'
                && ch != '8' && ch != '9' && ch != '0');
    }

    public static List<Integer> findVowelAndNonVowelCount(String message) {
        List<Integer> result = new ArrayList<>();
        int vowelCount = 0;
        int nonVowelCount = 0;

        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            if (isVowel(ch)) {
                vowelCount++;
            } else if (isNotSpecialCharacter(ch)) {
                nonVowelCount++;
            }
        }

        result.add(vowelCount);
        result.add(nonVowelCount);
        return result;
    }

    public static void main(String[] args) {
        String message = "hello world, how are you";
        List<Integer> result = findVowelAndNonVowelCount(message);
        System.out.println(result);
    }
}