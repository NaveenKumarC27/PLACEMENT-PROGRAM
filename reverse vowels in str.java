import java.util.Scanner;

public class ReverseVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(reverseVowels(input));
    }

    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = s.length() - 1;
        String vowels = "aeiouAEIOU";

        while (left < right) {
            if (vowels.indexOf(chars[left]) == -1) {
                left++;
            } else if (vowels.indexOf(chars[right]) == -1) {
                right--;
            } else {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        return new String(chars);
    }
}
