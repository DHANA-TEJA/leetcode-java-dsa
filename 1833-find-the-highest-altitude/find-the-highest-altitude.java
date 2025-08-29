class Solution {
    public int largestAltitude(int[] gain) {
        int[] g = new int[gain.length+1];
        g[0] = 0;
        for(int i = 1; i <gain.length+1 ; i++){
            g[i] = g[i-1] + gain[i-1];
        }
        int max =  0;
        for(int i:g){
            if(i > max){
                max = i ;
            }
        }
        return max;
    }
}