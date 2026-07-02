import java.util.*;

class Solution {
    /* Function to get the highest 
    occurring element in array nums */
    public int mostFrequentElement(int[] nums) {
        
        // Variable to store the size of array
        int n = nums.length;
        
        // Variable to store maximum frequency
        int maxFreq = 0; 
        
        /* Variable to store element 
        with maximum frequency */
        int maxEle = 0;
        
        // Visited array
        boolean[] visited = new boolean[n];
        
        // First loop
        for (int i = 0; i < n; i++) {
            // Skip second loop if already visited
            if (visited[i]) continue;
            
            /* Variable to store frequency
            of current element */
            int freq = 0;