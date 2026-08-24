class Solution {
    public boolean checkDivisibility(int n) {
        int t=n;
        int sum=0;
        int product=1;
        int res=0;
        while(t>0){
            res=t%10;
            sum+=res;
            product*=res;
            t/=10;
        }
        if(n%(sum+product)==0){
            return true;
        }
        return false;
    }
}