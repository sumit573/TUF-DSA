class Solution {
    public void rotateArrayByOne(int[] nums) {
        int n = nums.length;

        if(n==0) return;

        for(int i=0;i< n-1;i++){
            nums[i] = nums[i+1];
        }
    }

        int temp = nums[0];

        nums[n-1] = temp; 
}