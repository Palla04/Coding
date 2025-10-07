import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Remove_duplicates_from_an_array_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // Use LinkedHashSet to maintain insertion order while removing duplicates
        Set<Integer> unique = new LinkedHashSet<>();
        
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            unique.add(num);
        }
        
        sc.close();
        
        // Print all unique elements in original order
        for (int num : unique) {
            System.out.print(num + " ");
        }
    }
}
