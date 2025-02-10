import java.util.Scanner;

public class VariableInitializer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        String[] declarations = input.split(";");
        StringBuilder integers = new StringBuilder("Integers\n");
        StringBuilder characters = new StringBuilder("Characters\n");

        for (String declaration : declarations) {
            declaration = declaration.trim();
            if (declaration.startsWith("int")) {
                String[] vars = declaration.substring(3).split(",");
                for (String var : vars) {
                    String[] parts = var.split("=");
                    String varName = parts[0].trim();
                    String value = parts.length > 1 ? parts[1].trim() : "junk";
                    integers.append(varName).append("=").append(value).append("\n");
                }
            } else if (declaration.startsWith("char")) {
                String[] vars = declaration.substring(4).split(",");
                for (String var : vars) {
                    String[] parts = var.split("=");
                    String varName = parts[0].trim();
                    String value = parts.length > 1 ? parts[1].trim() : "junk";
                    characters.append(varName).append("=").append(value).append("\n");
                }
            }
        }

        System.out.print(integers.toString());
        System.out.print(characters.toString());
    }
}
