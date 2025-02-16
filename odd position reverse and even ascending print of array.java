import java.util.*;

public class ClosestSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int[] nums = new int[T];

        for (int i = 0; i < T; i++) {
            nums[i] = scanner.nextInt();
        }

        // Handling odd-length input properly
        int oddSize = (T + 1) / 2;
        int evenSize = T / 2;

        Integer[] odd = new Integer[oddSize];
        int[] even = new int[evenSize];

        int l = 0, m = 0;
        for (int i = 0; i < T; i++) {
            if (i % 2 == 0) {
                odd[l++] = nums[i];
            } else {
                even[m++] = nums[i];
            }
        }

        Arrays.sort(odd, Collections.reverseOrder()); // Descending order for odd positions
        Arrays.sort(even); // Ascending order for even positions

        for (int i = 0; i < evenSize; i++) {
            System.out.print(odd[i] + " " + even[i] + " ");
        }
        
        // If there's an extra odd-positioned element, print it
        if (oddSize > evenSize) {
            System.out.print(odd[oddSize - 1]);
        }

        scanner.close();
    }
}
