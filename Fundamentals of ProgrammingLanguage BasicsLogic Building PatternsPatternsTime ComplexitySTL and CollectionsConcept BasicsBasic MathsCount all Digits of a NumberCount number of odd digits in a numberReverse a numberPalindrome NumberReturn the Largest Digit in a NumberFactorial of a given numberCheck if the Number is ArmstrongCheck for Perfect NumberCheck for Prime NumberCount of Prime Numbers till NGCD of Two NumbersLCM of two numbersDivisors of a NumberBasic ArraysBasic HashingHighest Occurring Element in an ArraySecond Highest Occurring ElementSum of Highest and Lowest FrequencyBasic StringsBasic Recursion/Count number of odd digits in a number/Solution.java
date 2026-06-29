class Solution {
    public int countOddDigit(int n) {
        int count=0;
        while(n > 0){
            int lastDidgit = n % 10;
            if(lastDidgit % 2 !=0){
                count = count + 1;
            }
             n = n/10;
        }
        return count;
    }
}