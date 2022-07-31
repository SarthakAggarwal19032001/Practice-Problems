class Solution {
    public int findKthPositive(int[] arr, int k) {
        int start = 0, end = arr.length;
        while(start < end){
            int mid = start + ((end - start)/2);
            if((arr[mid] - (mid  + 1)) >= k){
                end = mid;
            }else{
               start = mid + 1;
            }
        }
        return start + k ;
    }
}
