class Solution {
    public void pattern5(int n) {
         for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
         }
    }
}