        
    }
    private void rev(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start]= nums[end];
            nums[end] = temp;
        rev(nums, k, n-1);
        rev(nums, 0, n-1);
        rev(nums, 0, k-1);
            start++;
            end--;
        }
    }
}