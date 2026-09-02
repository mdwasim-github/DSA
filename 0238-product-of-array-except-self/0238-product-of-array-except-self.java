class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int prodL=1;
        int prodR=1;

        for(int i=n-1;i>=0;i--){
            result[i]=prodR;
            prodR=prodR*nums[i];
        }
        for(int i=0;i<n;i++){
            result[i]=result[i]*prodL;
            prodL=prodL*nums[i];
        }
        return result;
    }
}