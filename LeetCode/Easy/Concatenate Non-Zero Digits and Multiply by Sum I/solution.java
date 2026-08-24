class Solution {
    public long sumAndMultiply(int n) {
        int sum=0;
        int x=0;
        int place=1;
        while(n>0){
            int rem=n%10;
            if(rem!=0){
                sum+=rem;
                x=rem*place +x;
                place*=10;
            }
            n/=10;
        }
       
        return (long) x * sum;
    }
}