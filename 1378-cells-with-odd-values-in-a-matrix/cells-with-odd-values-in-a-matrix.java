class Solution {
    public int oddCells(int m, int n, int[][] indices) {
       int[][] max = new int[m][n];
       for(int[] x :indices){
           int r = x[0];
           int c = x[1];
           for(int i = 0; i < max.length ; i++){
               for( int j = 0 ; j < max[i].length ; j++){
                   if(i == r ){
                        max[i][j]++;
                   }
               }
           }
           for(int i = 0; i < max.length ; i++){
               for( int j = 0 ; j < max[i].length ; j++){
                   if(j == c ){
                       max[i][j]++;
                   }
               }
           }
       }
       int odd = 0;
        for (int[] ints : max) {
            for (int anInt : ints) {
                if (anInt % 2 != 0) {
                    odd++;
                }
            }
        }
        return odd;
    }
}