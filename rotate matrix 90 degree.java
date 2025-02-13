import java.util.Scanner;

public class MatrixInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        input = input.replaceAll("\\[|\\]", "");
        String[] values = input.split(",");
        int size = (int) Math.sqrt(values.length);
        if (size * size != values.length) {
            System.out.println("Invalid input: Not a square matrix");
            return;
        }
        int[][] matrix = new int[size][size];
        int index = 0;
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = Integer.parseInt(values[index].trim());
                index++;
            }
        }
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print("[");
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[size - 1 - j][i]);
                if (j < size - 1) System.out.print(",");
            }
            System.out.print("]");
            if (i < size - 1) System.out.print(",");
        }
        System.out.println("]");

    }
}
