import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramChecker1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence or phrase: ");
        String input = scanner.nextLine();
        
        if (isPangram(input)) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        // Remove non-alphabetic characters and convert to lowercase
        input = input.replaceAll("[^a-zA-Z]", "").toLowerCase();
        
        // Create a set to store the unique letters
        Set<Character> letters = new HashSet<>();
        
        for (char c : input.toCharArray()) {
            letters.add(c);
        }
        
        // Check if the set contains all 26 letters
        return letters.size() == 26;
    }
}

