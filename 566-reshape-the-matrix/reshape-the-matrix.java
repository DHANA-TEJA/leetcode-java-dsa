class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int[][] ans = new int[r][c];
        int[] set = new int[mat.length * mat[0].length];
        int index = 0;

        for (int i = 0 ; i < mat.length; i++){
            for(int j = 0; j < mat[i].length;j++){
                set[index++] = mat[i][j];
            }
        }

        index = 0;

        if(r*c == mat.length * mat[0].length){
            for (int i = 0 ; i < r; i++){
                for(int j = 0; j < c;j++){
                    ans[i][j] = set[index++];
                    }
                }
            return ans;
        }
        else{
            return mat;
        }


    }
}