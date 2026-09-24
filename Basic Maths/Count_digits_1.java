class Solution {
    public int countDigit(int n) {
       int c = 0;
       n = Math.abs(n);
       if(n==0){
          return 1;
       }
       while(n>0){
          n=n/10;
          c++;
       }
       return c;
    }
}