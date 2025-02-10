
import java.util.Scanner;

public class LargestElementWithMaxProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        int maxProduct = Integer.MIN_VALUE;
        int largestElement = -1;

        for (int i = 1; i < N - 1; i++) {
            int product = arr[i - 1] * arr[i + 1];
            if (product > maxProduct) {
                maxProduct = product;
                largestElement = arr[i];
            }
        }

        System.out.println(largestElement);
        scanner.close();
    }
}
