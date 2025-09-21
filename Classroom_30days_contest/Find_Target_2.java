import java.util.*;
public class Find_Target_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read array size
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Read target
        int target = sc.nextInt();

        // Perform linear search
        int res = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                res = i;
                break; // stop once found
            }
        }

        // Print result
        System.out.println(res);

        sc.close(); // close scanner (best practice)
    }
}


