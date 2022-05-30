public class TwoSum {
    /* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
*/

public int[] twoSum(int[] nums, int target) {
    int arr[]=new int[2];
    for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]+nums[j]==target){
                arr[0]=i;
                arr[1]=j;  
                break;
            }
            
        }
    }
    
return arr; 
}
public static void main(String[] args) {
    TwoSum ts=new TwoSum();
    int arr[]={3,2,4};
    int t=6;
    int ans[]=ts.twoSum(arr, t);
    for(int i=0;i<ans.length;i++)
    System.out.println(ans[i]);
}
}
