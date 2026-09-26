class Solution {
    public int largestElement(int[] nums) {
        int largeEle = nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i] > largeEle){
                largeEle = nums[i];
            }
        }
        return largeEle;
    }
}