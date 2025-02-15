import java.util.Scanner;

public class PascalPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        System.out.println("** Printing the pattern... **");

        for (int i = 0; i < N; i++) {
            // Print leading spaces for pyramid alignment
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");  
            }

            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1); // Compute next Pascal's value
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
