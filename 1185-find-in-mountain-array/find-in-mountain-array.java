/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int x = tar(mountainArr,target,true);
        int y = tar(mountainArr,target,false);
        if (x != -1) {
            return x;
        }
        else {
            return y;
        }
    }
    int tar(MountainArray mountainArr,int target, boolean isAsc){
     if(isAsc){
         int start = 0;
         int end = mout(mountainArr);

         while (start <= end){
             int mid = start + (end - start )/2;
             if(target > mountainArr.get(mid)){
                 start = mid + 1;
             }
             else if(target < mountainArr.get(mid)){
                 end = mid - 1;
             }
             else{
                 return mid;
             }
         }
     }
     else {
         int start = mout(mountainArr) + 1;
         int end = mountainArr.length() - 1;

         while (start <= end){
             int mid = start + (end - start )/2;
             if(target > mountainArr.get(mid)){

                 end = mid - 1;
             }
             else if(target < mountainArr.get(mid)){
                 start = mid + 1;
             }
             else{
                 return mid;
             }
         }
     }
     return -1;
    }

    int mout(MountainArray mountainArr){
        int start = 0;
        int end = mountainArr.length() - 1;

        while (start < end){
            int mid = start + (end - start)/2;
            if(mountainArr.get(mid) > mountainArr.get(mid + 1)){
                end= mid;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }
}
