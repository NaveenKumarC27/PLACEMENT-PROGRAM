import java.util.Scanner;

public class MatrixSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[][] bigMatrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                bigMatrix[i][j] = scanner.nextInt();
            }
        }

        int M = scanner.nextInt();
        int[][] smallMatrix = new int[M][M];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                smallMatrix[i][j] = scanner.nextInt();
            }
        }

        boolean found = False;
        for (int i = 0; i <= N - M; i++) {
            for (int j = 0; j <= N - M; j++) {
                if (isMatch(bigMatrix, smallMatrix, i, j)) {
                    found = True;
                    break;
                }
            }
            if (found) break;
        }

        System.out.println(found);
    }

    private static boolean isMatch(int[][] bigMatrix, int[][] smallMatrix, int startRow, int startCol) {
        for (int i = 0; i < smallMatrix.length; i++) {
            for (int j = 0; j < smallMatrix[i].length; j++) {
                if (bigMatrix[startRow + i][startCol + j] != smallMatrix[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
