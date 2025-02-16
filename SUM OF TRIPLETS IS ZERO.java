import java.util.Arrays;
import java.util.Scanner;

public class ClosestSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int[] nums = new int[T];

        for (int i = 0; i < T; i++) {
            nums[i] = scanner.nextInt();
        }

        if (!threeSumClosest(nums)) {
            System.out.println("No Elements Found");
        }
        scanner.close();
    }

    public static boolean threeSumClosest(int[] nums) {
        boolean found = false;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                         System.out.print("Elements are ");
                        System.out.println(nums[i] + " " + nums[j] + " " + nums[k]);
                        found = true;
                    }
                }
            }
        }

        return found;
    }
}
