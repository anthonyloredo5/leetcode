class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        
        // Iterate through the flowerbed
        for (int i = 0; i < flowerbed.length; i++) {
            // Check if the current plot is empty and adjacent plots are also empty
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1; // Plant a flower
                count++; // Increment the count of planted flowers
                if (count >= n) {
                    return true; // Early exit if we've planted enough flowers
                }
                i++; // Skip the next plot as it is now adjacent to a flower
            }
        }
        
        return count >= n; // Return true if we managed to plant enough flowers
    }
}
