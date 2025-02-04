import java.util.Scanner;

public class StringSimilarity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < t; i++) {
            String s = scanner.nextLine();
            System.out.println(calculateSimilarity(s));
        }
    }

    private static int calculateSimilarity(String s) {
        int totalSimilarity = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            totalSimilarity += longestCommonPrefix(s, s.substring(i));
        }

        return totalSimilarity;
    }

    private static int longestCommonPrefix(String a, String b) {
        int count = 0;
        int minLength = Math.min(a.length(), b.length());

        while (count < minLength && a.charAt(count) == b.charAt(count)) {
            count++;
        }

        return count;
    }
}
