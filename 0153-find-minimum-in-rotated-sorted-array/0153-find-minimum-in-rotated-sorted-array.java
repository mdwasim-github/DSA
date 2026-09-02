// class Solution {
//     public int findMin(int[] nums) {
//         int low=0;
//         int high = nums.length-1;

//         while(low<high){
//             int mid = (low + high)/2;

//             if(nums[mid]>nums[high]){
//                 low = mid + 1;
//             }else{
//                 high = mid;
//             }
//         }
//         return nums[high];
//     }
// }

class Solution{
    public int findMin(int nums[]){
        int start = 0;
        int end = nums.length - 1;

        while(start < end){
            int mid = (start + end) / 2;

            if(nums[mid]>nums[end]){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return nums[end];
    }
}