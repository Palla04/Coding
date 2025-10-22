import java.util.Scanner;
public class Rotate_an_Array_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read n and k
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Handle large k
        k = k % n;
        
        // Rotate array to the right by k positions
        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = arr[i];
        }
        
        // Print rotated array
        for (int i = 0; i < n; i++) {
            System.out.print(rotated[i] + " ");
        }
        sc.close();
    }
}
