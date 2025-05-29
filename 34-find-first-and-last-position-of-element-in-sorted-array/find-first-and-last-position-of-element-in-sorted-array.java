class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};

        int start = BinarySearch(nums,target,true);
        int end = BinarySearch(nums,target,false);

        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    int BinarySearch(int[] arr, int target, boolean isStart){
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid -1;
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
            else {
                ans = mid;
                if(isStart){
                    end = mid -1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return ans;
        }
}
