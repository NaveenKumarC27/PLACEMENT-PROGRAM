import java.util.Scanner;

public class DivisorFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] array = new int[n];
        
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        int result = findDivisor(array);
        System.out.println(result);
    }

    private static int findDivisor(int[] array) {
        for (int num : array) {
            boolean isDivisor = true;
            for (int otherNum : array) {
                if (otherNum % num != 0) {
                    isDivisor = false;
                    break;
                }
            }
            if (isDivisor) {
                return num;
            }
        }
        return -1;
    }
}
