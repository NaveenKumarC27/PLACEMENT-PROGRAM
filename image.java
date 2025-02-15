import java.util.Scanner;

public class PatternGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int size = 2 * N - 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int value = N - Math.min(Math.min(i, j), Math.min(size - i - 1, size - j - 1));
                System.out.print(value + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
