class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max=0;
        int min=0;
        int max_sum=Integer.MIN_VALUE;
        int min_sum=Integer.MAX_VALUE;
        int s=0;
        for(int i=0;i<nums.length;i++){
           s=s+nums[i];
           max=Math.max(max+nums[i],nums[i]);
           max_sum=Math.max(max,max_sum);
           min=Math.min(min+nums[i],nums[i]);
           min_sum=Math.min(min,min_sum);
        }
        if(max_sum<0){
            return max_sum;
        }
        int c=s-min_sum;
        return(Math.max(c,max_sum));
    }
}