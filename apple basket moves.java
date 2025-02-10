import java.util.Scanner;

public class AppleBaskets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the number of baskets
        int N = scanner.nextInt();
        int[] apples = new int[N];
        
        // Get the number of apples in each basket
        for (int i = 0; i < N; i++) {
            apples[i] = scanner.nextInt();
        }
        
        int totalApples = 0;
        for (int apple : apples) {
            totalApples += apple;
        }
        
        int average = totalApples / N;
        int moves = 0;
        
        for (int apple : apples) {
            if (apple > average) {
                moves += apple - average;
            }
        }
        
        System.out.println("No of moves = "+moves);
    }
}
