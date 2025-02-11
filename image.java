import java.util.Scanner;

public class WordValueChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstWord = scanner.nextLine();
        String secondWord = scanner.nextLine();
        String targetWord = scanner.nextLine();
        
        boolean result = isSumEqual(firstWord, secondWord, targetWord);
        System.out.println(result);
        
        scanner.close();
    }

    public static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int firstValue = getNumericalValue(firstWord);
        int secondValue = getNumericalValue(secondWord);
        int targetValue = getNumericalValue(targetWord);
        
        return (firstValue + secondValue) == targetValue;
    }

    private static int getNumericalValue(String word) {
        StringBuilder numericalValue = new StringBuilder();
        
        for (char c : word.toCharArray()) {
            numericalValue.append(c - 'a');
        }
        
        return Integer.parseInt(numericalValue.toString());
    }
}
