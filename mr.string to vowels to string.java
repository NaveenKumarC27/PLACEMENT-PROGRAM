import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VowelPairs {
    private static final String[] numberWords = {
        "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", 
        "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", 
        "seventeen", "eighteen", "nineteen", "twenty", "thirty", "forty", "fifty", 
        "sixty", "seventy", "eighty", "ninety", "hundred"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close();

        int D = calculateVowelCount(numbers);
        int pairCount = countPairs(numbers, D);
        System.out.println(numberToText(pairCount));
    }

    private static int calculateVowelCount(int[] numbers) {
        int count = 0;
        for (int number : numbers) {
            count += countVowels(numberToText(number));
        }
        return count;
    }

    private static int countVowels(String word) {
        int count = 0;
        for (char c : word.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    private static int countPairs(int[] numbers, int D) {
        Map<Integer, Integer> numCount = new HashMap<>();
        int pairs = 0;

        for (int number : numbers) {
            int complement = D - number;
            pairs += numCount.getOrDefault(complement, 0);
            numCount.put(number, numCount.getOrDefault(number, 0) + 1);
        }
        return pairs;
    }

    

    private static String numberToText(int count) {
        if (count > 100) {
            return "greater 100";
        }
        return numberWords[count];
    }
}
