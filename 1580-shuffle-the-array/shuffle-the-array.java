class Solution {
    public int[] shuffle(int[] nums, int n) {
                int[] ans = new int[2*n];
        int n1 = 0;
        int n2 = n;
       int i =0;
        while (n1< n){
            ans[i] = nums[n1];
            ans[i+=1] = nums[n2];
            i++;
            n1++;
            n2++;
        }
       return ans;
    }
}