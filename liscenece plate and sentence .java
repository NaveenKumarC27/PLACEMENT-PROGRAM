import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ShortestCompletingWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String licensePlate = scanner.nextLine();
        String[] words = scanner.nextLine().split(" ");
        
        System.out.println(findShortestCompletingWord(licensePlate, words));
    }

    public static String findShortestCompletingWord(String licensePlate, String[] words) {
        Map<Character, Integer> charCount = new HashMap<>();
        
        for (char c : licensePlate.toCharArray()) {
            if (Character.isLetter(c)) {
                char lowerChar = Character.toLowerCase(c);
                charCount.put(lowerChar, charCount.getOrDefault(lowerChar, 0) + 1);
            }
        }

        String shortestWord = null;

        for (String word : words) {
            if (isCompletingWord(word, charCount)) {
                if (shortestWord == null || word.length() < shortestWord.length()) {
                    shortestWord = word;
                }
            }
        }

        return shortestWord;
    }

    private static boolean isCompletingWord(String word, Map<Character, Integer> charCount) {
        Map<Character, Integer> wordCount = new HashMap<>();

        for (char c : word.toCharArray()) {
            wordCount.put(c, wordCount.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (wordCount.getOrDefault(entry.getKey(), 0) < entry.getValue()) {
                return false;
            }
        }

        return true;
    }
}
