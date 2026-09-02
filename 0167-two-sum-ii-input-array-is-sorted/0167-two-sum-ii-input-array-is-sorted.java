//Brute Force Approach

// class Solution{
//     public int[] twoSum(int[] numbers,int target){
//         int len=numbers.length;
//         for(int i=0;i<len;i++){
//             for(int j=i+1;j<len;j++){
//                 if(numbers[i]+numbers[j] == target){
//                     return new int[]{i+1,j+1};
//                 }
//             }
//         }
//         return new int[0];
//     }
// }



//Two Pointer Approach
class Solution{
    public int[] twoSum(int numbers[],int target){
        int len=numbers.length;
        int left=0;
        int right=len-1;
        while(left<right){
            if(numbers[left]+numbers[right]>target){
                right--;
            }else if(numbers[left]+numbers[right]<target){
                left++;
            }else{
                return new int[]{left+1,right+1};
            }
        }
        return new int[]{-1,-1};
    }
}

//HashMap Approach

// class Solution {
//     public int[] twoSum(int[] numbers, int target) {
//         int len = numbers.length;
//         HashMap<Integer,Integer> map = new HashMap<>();
//         for(int i=0;i<len;i++){
//             if(map.containsKey(target - numbers[i])){
//                 return new int[]{map.get(target - numbers[i]),i+1};
//             }
//             map.put(numbers[i],i+1);
//         }
//         return new int[0];
//     }
// }


