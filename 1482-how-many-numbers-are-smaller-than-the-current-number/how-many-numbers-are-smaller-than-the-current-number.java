class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0 ;i<nums.length ;i++){
            ans[i] = find(nums,nums[i]);
        }
        return ans;
    }
    public int find(int[] nums,int num){
        int small = 0;
        for(int x: nums){
            if(num>x){
                small+=1;
            }
        }
        return small;
    }
}