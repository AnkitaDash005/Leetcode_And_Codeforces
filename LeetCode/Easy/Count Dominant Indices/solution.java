class Solution {
    public int dominantIndices(int[] nums) {
        int d=0;
        for(int i=0;i<nums.length-1;i++){
            int sum=0;
            int count=0;
            for(int j=i+1;j<nums.length;j++){
                sum+=nums[j];
                count++;
            }
            if((sum/count)<nums[i]){
                d++;
            }
        }
        return d;
    }
}