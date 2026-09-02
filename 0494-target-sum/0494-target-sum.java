class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return calculate(nums,target,0,0);
    }
    public int calculate(int[] nums,int tar,int index,int sum) {
        if (index == nums.length) {
            if(sum==tar){
                return 1;
            }
            return 0;
        }
        int add = calculate(nums, tar, index + 1, sum + nums[index]);
        int sub = calculate(nums, tar, index + 1, sum - nums[index]);
        return add + sub;
    }
}