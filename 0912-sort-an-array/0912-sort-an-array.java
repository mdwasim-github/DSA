class Solution {
    public int[] merge(int a1[],int a2[]){
        int m = a1.length;
        int n = a2.length;
        int res[] = new int[m+n];

        int p1 = 0;
        int p2 = 0;
        for(int i=0;i<res.length;i++){
            int val1 = (p1 == m) ? Integer.MAX_VALUE: a1[p1];
            int val2 = (p2 == n) ? Integer.MAX_VALUE : a2[p2];

            if(val1 <= val2){
                res[i] = val1;
                p1++;
            }else{
                res[i] = val2;
                p2++;
            }
        }
        return res;
    }

    public int[] mergeSort(int nums[],int left,int right){
        if(left == right){
            return new int[]{ nums[left]};
        }
        int mid = (left + right)/2;
        int leftHalf[] = mergeSort(nums,left,mid);
        int rightHalf[] = mergeSort(nums, mid+1,right);
        return merge(leftHalf,rightHalf);
    }
    public int[] sortArray(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }
}