class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] year = new int[101]; // 1950 to 2050

        // Apply difference updates
        for (int[] log : logs) {
            year[log[0] - 1950]++;   // birth
            year[log[1] - 1950]--;   // death
        }

        // Prefix sum to find max population
        int curr = 0, max = 0, ans = 1950;
        for (int i = 0; i < 101; i++) {
            curr += year[i];
            if (curr > max) {
                max = curr;
                ans = 1950 + i;
            }
        }

        return ans;
    }
}
