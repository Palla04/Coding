import java.util.Scanner;

public class Maximum_Subarray_Sum_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), K = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) A[i] = sc.nextInt();

        long[][] dp = new long[n][K + 1];
        long ans = A[0];

        for (int k = 0; k <= K; k++) dp[0][k] = A[0];

        for (int i = 1; i < n; i++) {
            for (int k = 0; k <= K; k++) {
                dp[i][k] = Math.max(dp[i - 1][k] + A[i], A[i]);

                if (k > 0) {
                    dp[i][k] = Math.max(dp[i][k], dp[i - 1][k - 1]);
                }

                ans = Math.max(ans, dp[i][k]);
            }
        }
        sc.close();
        System.out.println(ans);
    }
}
