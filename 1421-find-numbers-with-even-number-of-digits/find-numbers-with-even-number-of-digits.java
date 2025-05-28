class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int j : nums) {
            if (num(j) % 2 == 0) {
                count += 1;
            }
        }
        return count;
    }
    int num(int i){
        int x = 0;
        while(i != 0){
            i = i / 10;
            x+=1;
        }
        return x;
    }
}