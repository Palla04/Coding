class Solution {
    public int countOddDigit(int n) {
        int c=0;
        if(n==1){
            return 0;
        }
        while(n>0){
            int d=n%10;
            if(d%2 != 0){
                c++;
            }
            n=n/10;

        }
        return c;
    }
} {
    
}
