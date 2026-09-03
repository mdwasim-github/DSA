class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
        for(int third : nums){
            if(third <= first){
                first=third;
            }else if(third<=second){
                second=third;
            }else if(third > first || third > second){
                return true;
            }
        }
        return false;
    }
}

