class Solution {
    public int[] sumZero(int n) {
    int[] ans = new int[n];
    if(n % 2 != 0){
        ans[(n/2)] = 0;
        for(int i = 1  ; i < n/2 + 1; i++){
            if(i != (n/2)+1){
            ans[i-1] = i;
            ans[n-i] = -i;}
        }
    }
    else{
        for(int i = 1  ; i < n/2 + 1; i++){
            ans[i-1] = i;
            ans[n-i] = -i;}

    }
    return ans;
    }
}