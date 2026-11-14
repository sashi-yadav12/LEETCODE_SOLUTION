class Solution {
    public int maxOperations(int[] nums, int k) {
        int start = 0;
        int end = nums.length-1;
        int sum =0;
        Arrays.sort(nums);
        int count =0;
        while(start < end){
            sum = nums[start] + nums[end];
            if(sum == k){
                start++;
                end--;
                count++;

            }
            else if( sum < k){
                start++;
            }
            else{
                end--;
            }

        }
        return count;
        
    }
}