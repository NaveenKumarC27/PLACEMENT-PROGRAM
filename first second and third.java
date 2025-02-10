import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        
        List<String> result = findThirdWords(text, first, second);
        
        System.out.println(String.join("\n",result));
    }

    public static List<String> findThirdWords(String text, String first, String second) {
        String[] words = text.split(" ");
        List<String> thirdWords = new ArrayList<>();
        
        for (int i = 0; i < words.length - 2; i++) {
            if (words[i].equals(first) && words[i + 1].equals(second)) {
                thirdWords.add(words[i + 2]);
            }
        }
        
        return thirdWords;
    }
}
