class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second= Integer.MAX_VALUE;
        int i=0;
        while(i < nums.length){
            int num = nums[i];
            if(num <= first){
                first = num;
            }
            else if(num <= second){
                second = num;
            }
            else{
                return true;
            }
            i++;
        }
        return false;
        
    }
}