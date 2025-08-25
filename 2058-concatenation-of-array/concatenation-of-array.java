class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[(2* nums.length)];
        for(int i = 0; i < (2 *(nums.length));i++){
            if( i > nums.length-1 ){
               int n = nums.length;
                ans[i] = nums[i-n];}
            else {
            ans[i] = nums[i];}
        }
     return ans;
    }
}