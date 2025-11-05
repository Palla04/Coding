import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class First_Non_Repeating_Character_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine(); // take user input

        char result = findFirstNonRepeating(str);

        if (result != '\0')
            System.out.println("First non-repeating character: " + result);
        else
            System.out.println("No non-repeating character found.");

        sc.close();
    }

    public static char findFirstNonRepeating(String str) {
        str = str.toLowerCase(); // handle case-insensitivity
        int[] count = new int[256]; // for ASCII characters

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        // Find first character with count == 1
        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }

        return '\0'; // no unique character
    }
}
