import java.util.Scanner;

public class AND_OR_Subarray_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int N = sc.nextInt();
            int[] A = new int[N];
            int[] B = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                B[i] = sc.nextInt();
            }
            int maxLen = 0;
            
            for(int i=0;i<N;i++){
                int orVal = 0;
                int andVal = ~0;
                
                for(int j=i;j<N;j++){
                    orVal |= A[j];
                    andVal &= B[j];
                    
                    if(orVal == andVal){
                        maxLen = Math.max(maxLen, j-i+1);
                    }
                }
            }
             System.out.println(maxLen);
        }
        sc.close();
    }
}
