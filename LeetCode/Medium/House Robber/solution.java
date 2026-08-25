class Solution {
    public int rob(int[] nums) {
       int prev2=0;
       int prev1=0;
       int max=0;
       for(int i:nums){
            max=Math.max(prev1,prev2+i);
            prev2=prev1;
            prev1=max;

       }
       return prev1;
    }
}