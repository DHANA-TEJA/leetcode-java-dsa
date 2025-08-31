class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
    
    int n = mat[0].length;
    boolean[] z = new boolean[4];
  
    int index =0;


    for(int k = 0 ; k < 4 ; k++){
        boolean yo = true;
        int[][] ans = new int[mat.length][mat[0].length];
        for (int i = 0 ; i < mat.length ; i++){
            for (int j = 0 ; j < mat[i].length ; j++){
                ans[j][n - i -1 ] = mat[i][j];
                }
            }
        mat = ans;
        
        for (int i = 0 ; i < mat.length ; i++){
             for (int j = 0 ; j < mat[i].length ; j++){
                if( mat[i][j] != target[i][j]){
                    yo = false;
                    }
                }
             }
        if(yo == false){
            z[index++] = false;
        }
        else{
             z[index++] = true;
        }

    }
        for(boolean x: z){
            if(x == true){
                return true;
            }
        }
        return false;

    }
}