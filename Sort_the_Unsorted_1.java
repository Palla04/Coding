import java.util.Scanner;
import java.util.Arrays;

public class Sort_the_Unsorted_1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
        scan.close(); // ✅ good practice to close Scanner
    }
}
