class Solution {
    public boolean checkGoodInteger(int n) {
        int dS=0;
        int sS=0;
        while(n!=0){
            int rem=n%10;
            dS+=rem;
            sS+=(rem*rem);
            n/=10;
        }
        if(sS-dS>=50){
            return true;
        }
        return false;
    }
}