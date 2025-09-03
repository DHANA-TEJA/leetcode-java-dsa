class Solution {
    public void setZeroes(int[][] matrix) {
        List<List<Integer>> z = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    z.add(List.of(i, j));
                }
            }
        }


        for (List<Integer> x : z) {
            int row = x.get(0);
            int col = x.get(1);
            if (matrix.length != matrix[0].length) {
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        matrix[row][j] = 0;
                        if (j < matrix.length) {
                            matrix[i][col] = 0;
                        }
                    }
                }
            } else {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[row][j] = 0;
                    if (j < matrix.length) {
                        matrix[j][col] = 0;
                    }
                }
            }
        }
            System.out.println(Arrays.deepToString(matrix));
            return;
    }

}