            if(num == 1){
                count++;
            }else{
                maxCount = Math.max(maxCount,count);
                count =0;
            }
        }
    }
        return maxCount;
}