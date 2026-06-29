class Solution {
    public boolean isArmstrong(int n) {
       int originalNumber = n;
       int sum=0;
       int temp=n;
       int count=0;
       while(temp > 0){
        count++;
        temp = temp/10;
       }
       while(n > 0){
        int lastDigit = n % 10;
          sum = sum + (int) Math.pow(lastDigit, count);
           n=n/10;
       }
      
      return originalNumber == sum;
    }
}
