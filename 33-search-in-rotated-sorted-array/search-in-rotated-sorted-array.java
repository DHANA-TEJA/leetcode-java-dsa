class Solution {
    public int search(int[] nums, int target) {
        int high = mout(nums);
        int x = binary(nums,target,0,high);
        if(x == -1){
            return binary(nums,target,high+1,nums.length -1);
        }
        else{
            return x;
        }
    }
    int binary(int[] arr,int target, int start, int end ){
        while (start <= end){
            int mid = start + (end - start)/2;
                if(target > arr[mid]){
                    start = mid + 1;
                }
                else if(target < arr[mid]){
                    end = mid -1;
                }
                else {
                    return mid;
                }
            }
         return -1;
        }

        int mout(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] < arr[mid +1] && arr[0] <arr[mid]){
                start = mid + 1;
            }
            else if (arr[mid] > arr[mid +1]){
                return mid;
            }
            else{
                end = mid;
            }
        }
        return start;
    }
}