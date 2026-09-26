      for(int num : nums){
        if(num > largest){
            secondLargest = largest;
        }else if(num > secondLargest && num != largest){
            largest = num;
            secondLargest = num;
        }
      }
       return secondLargest == Long.MIN_VALUE ? -1 : (int) secondLargest;
    }
}