import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        in.close(); // Close the scanner to prevent resource leak

        StringBuilder r = new StringBuilder();
        String vowels = "AEIOUaeiou";
        String[] str = s.split(" ");
        int a = 1;

        for (String word : str) {
            StringBuilder temp = new StringBuilder();

            if (vowels.indexOf(word.charAt(0)) != -1) {
                temp.append(word);
            } else {
                temp.append(word.substring(1)).append(word.charAt(0));
            }

            temp.append("ma");
            temp.append("a".repeat(a)); // Efficiently add 'a' multiple times
            r.append(temp).append(" ");
            a++; // Increment only once per word
        }

        System.out.println(r.toString().trim()); // Trim extra space at the end
    }
}
