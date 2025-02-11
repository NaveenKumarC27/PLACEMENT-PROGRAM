import java.util.*;

public class LetterCombinations {
    private static final Map<Character, String> phoneMap = new HashMap<>() {{
        put('2', "abc");
        put('3', "def");
        put('4', "ghi");
        put('5', "jkl");
        put('6', "mno");
        put('7', "pqrs");
        put('8', "tuv");
        put('9', "wxyz");
    }};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String digits = scanner.nextLine();
        System.out.println(letterCombinations(digits));
    }

    public static String letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) return "No Combination of Strings";

        // Check for invalid characters like '0' or '1'
        for (char digit : digits.toCharArray()) {
            if (!phoneMap.containsKey(digit)) {
                return "No Combination of Strings";
            }
        }

        List<String> combinations = new ArrayList<>();
        backtrack(combinations, new StringBuilder(), digits, 0);
        return combinations.isEmpty() ? "No Combination of Strings" : String.join(" ", combinations);
    }

    private static void backtrack(List<String> combinations, StringBuilder combination, String digits, int index) {
        if (index == digits.length()) {
            combinations.add(combination.toString());
            return;
        }

        char digit = digits.charAt(index);
        String letters = phoneMap.get(digit);

        // Safety check for null
        if (letters == null) {
            return;
        }

        for (char letter : letters.toCharArray()) {
            combination.append(letter);
            backtrack(combinations, combination, digits, index + 1);
            combination.deleteCharAt(combination.length() - 1);
        }
    }
}
