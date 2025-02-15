import java.util.Arrays;
import java.util.Scanner;

public class ClosestSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int target = scanner.nextInt();
        int[] nums = new int[T];

        for (int i = 0; i < T; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println(threeSumClosest(nums, target));
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];

                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                } else if (Math.abs(currentSum - target) == Math.abs(closestSum - target)) {
                    closestSum = Math.max(closestSum, currentSum);
                }

                if (currentSum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return closestSum;
    }
}
