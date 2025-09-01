class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int[] min = new int[matrix.length];
        int[] max = new int[matrix[0].length];
        List<Integer> ans  = new ArrayList<>();
        int index1 = 0 ;
        int index2 = 0;
for (int j = 0; j < matrix[0].length; j++) {
            int maxs =   Integer.MIN_VALUE;
            for (int i = 0; i < matrix.length; i++) {
                if (maxs < matrix[i][j]) {
                    maxs = matrix[i][j];
                }
            }
            max[index2++] = maxs;
        }


        for (int i = 0; i < matrix.length; i++) {
            int mins = Integer.MAX_VALUE;

            for (int j = 0; j < matrix[i].length; j++) {
                if (mins > matrix[i][j]) {
                    mins = matrix[i][j];
                }
            }
            min[index1++] = mins;
        }
        int finmin= Integer.MIN_VALUE;
        int finmax = Integer.MAX_VALUE;
        for (int j : min) {
            if (finmin < j) {
                finmin = j;
            }
        }
        for (int j : max) {
            if (finmax > j) {
                finmax = j;
            }
        }
        if(finmin == finmax){
            ans.add(finmin);
        }
       return ans;
    }
}