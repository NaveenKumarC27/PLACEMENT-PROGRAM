import java.util.Scanner;

public class GrandchildrenCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        String[][] familyTree = new String[n][2];
        
        for (int i = 0; i < n; i++) {
            familyTree[i] = scanner.nextLine().split(" ");
        }        String name = scanner.nextLine();
        
        int grandchildrenCount = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (familyTree[j][1].equalsIgnoreCase(name) && familyTree[i][1].equalsIgnoreCase(familyTree[j][0])) {
                    grandchildrenCount++;
                }
            }
        }
        
        System.out.println(grandchildrenCount);
        scanner.close();
    }
}
