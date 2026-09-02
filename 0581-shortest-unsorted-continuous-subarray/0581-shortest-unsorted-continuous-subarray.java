// class Solution {
//     public int findUnsortedSubarray(int[] nums) {
//         int n=nums.length;
//         int left=-1;
//         int right=-2;
//         int min = nums[n-1];
//         int max = nums[0];
//         for(int i=1;i<n;i++){
//             max = Math.max(max,nums[i]);
//             if(nums[i] < max){
//                 right = i;
//             }
//         }
//         for(int i=n-2;i>=0;i--){
//             min=Math.min(min,nums[n-1-i]);  //n-1-i
//             if(nums[i]>min){
//                 left=;
//             }
//         }
//         if(right == 1){
//             return 0;
//         }
//         return right-left+1;
//     }
// }





// // class Solution{
// //     public int findUnsortedSubarray(int[] nums){
// //         int n=nums.length;
// //         int left=-1;
// //         int right=-2;
// //         int max=nums[0];
// //         int min=nums[n-1];
        
// //         for(int i=1;i<n;i++){
// //             max=Math.max(max,nums[i]);
// //             min=Math.min(min,nums[n-1-i]);
// //             if(nums[i]<max){
// //                 right=i;
// //             }else{
// //                 left=n-1-i;
// //             }
// //         }
// //         return right - left + 1;
// //     }
// // }


class Solution{
    public int findUnsortedSubarray(int A[]){
    int n = A.length, beg = -1, end = -2, min = A[n-1], max = A[0];
    for (int i=1;i<n;i++) {
      max = Math.max(max, A[i]);
      min = Math.min(min, A[n-1-i]);
      if (A[i] < max) end = i;
      if (A[n-1-i] > min) beg = n-1-i; 
    }
    return end - beg + 1;
    }
}