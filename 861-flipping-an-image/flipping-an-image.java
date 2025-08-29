class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
       for(int[] x : image){
            int start = 0;
            int end = x.length-1;
            int temp = 0;
            while (end >= start){
                temp = x[start];
                x[start] = x[end];
                x[end] = temp;
                end--;
                start++;
            }
        }
        for(int i = 0 ; i < image.length;i++){
            for(int j = 0 ; j < image[i].length; j++){
                if(image[i][j] == 0){
                    image[i][j] =1;
                }
                else{
                    image[i][j] = 0;
                }
            }
        }
        return image;
    }
}