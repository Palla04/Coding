import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Case_Insensitive_Character_Frequency_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        sc.close();
        
        // Step 1: Convert to lowercase and remove spaces
        S = S.toLowerCase().replaceAll(" ", "");
        
        // Step 2: Use TreeMap to keep keys sorted automatically
        Map<Character, Integer> freq = new TreeMap<>();
        
        // Step 3: Count frequency (letters and digits only)
        for (char ch : S.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                freq.put(ch, freq.getOrDefault(ch, 0) + 1);
            }
        }
        
        // Step 4: Print in sorted order
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
