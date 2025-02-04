import java.util.*;

public class GiftDistribution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input number of kids
        int numKids = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        // Input names of kids
        String[] kids = new String[numKids];
        for (int i = 0; i < numKids; i++) {
            kids[i] = scanner.nextLine();
        }
        
        // Input total number of gifts
        int totalGifts = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        // Input first two kids who received gifts
        String firstKid = scanner.nextLine();
        String secondKid = scanner.nextLine();
        
        // Determine direction
        int firstIndex = Arrays.asList(kids).indexOf(firstKid);
        int secondIndex = Arrays.asList(kids).indexOf(secondKid);
        
        String direction;
        if ((secondIndex - firstIndex + numKids) % numKids == 2) {
            direction = "Clockwise";
        } else {
            direction = "Anti-clockwise";
        }
        
        // Count gifts
        Map<String, Integer> giftCount = new HashMap<>();
        giftCount.put(firstKid, giftCount.getOrDefault(firstKid, 0) + 1);
        giftCount.put(secondKid, giftCount.getOrDefault(secondKid, 0) + 1);
        
        int currentIndex = secondIndex;
        for (int i = 2; i < totalGifts; i++) {
            if (direction.equals("Clockwise")) {
                currentIndex = (currentIndex + 2) % numKids; // Move 2 steps clockwise
            } else {
                currentIndex = (currentIndex - 2 + numKids) % numKids; // Move 2 steps anti-clockwise
            }
            String nextKid = kids[currentIndex];
            giftCount.put(nextKid, giftCount.getOrDefault(nextKid, 0) + 1);
        }
        
        // Determine who received the highest number of gifts
        String highestKid = Collections.max(giftCount.entrySet(), Map.Entry.comparingByValue()).getKey();
        
        // Output results
        System.out.println(direction);
        System.out.println(highestKid);
        
        scanner.close();
    }
}
