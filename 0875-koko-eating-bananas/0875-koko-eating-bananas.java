class Solution {
   public int minEatingSpeed(int[] piles, int h) {
    int start = 1;
    int end = Integer.MAX_VALUE;  // Set to the maximum possible speed initially
    int n = piles.length;
    
    // Set `end` to the maximum pile size, since the maximum speed is eating the largest pile in 1 hour
    for (int i = 0; i < n; i++) {
        end = Math.max(end, piles[i]);
    }
    
    int res = end;  // Initialize result to `end`
    
    while (start <= end) {
        int mid = start + (end - start) / 2;
        
        // If Koko can eat all piles at speed `mid` within `h` hours
        if (canEat(piles, n, h, mid)) {
            res = mid;  // This might be the minimum speed
            end = mid - 1;  // Try to find a smaller speed
        } else {
            start = mid + 1;  // Increase the speed
        }
    }
    
    return res;  // Return the minimum eating speed
}

boolean canEat(int[] piles, int n, int h, int max) {
    int hours = 0;
    
    for (int i = 0; i < n; i++) {
        // Calculate the number of hours Koko will need for each pile at speed `max`
        hours += (piles[i] + max - 1) / max;
    }
    
    return hours <= h;  // Return true if Koko can eat all piles in <= h hours
}

}