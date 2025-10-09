import java.util.Scanner;

public class Merge_two_sorted_array_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read size of first array
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        
        // Read size of second array
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        
        // Create a merged array
        int[] merged = new int[n + m];
        
        // Two pointers for each array
        int i = 0, j = 0, k = 0;
        
        // Merge both arrays
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }
        
        // Copy remaining elements of arr1 (if any)
        while (i < n) {
            merged[k++] = arr1[i++];
        }
        
        // Copy remaining elements of arr2 (if any)
        while (j < m) {
            merged[k++] = arr2[j++];
        }
        
        // Print merged array
        for (int x = 0; x < merged.length; x++) {
            System.out.print(merged[x]);
            if (x < merged.length - 1) System.out.print(" ");
        }
        
        sc.close();
    }
}
