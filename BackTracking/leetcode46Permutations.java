import java.util.ArrayList;
import java.util.List;

public class leetcode46Permutations {
    // public static List<List<Integer>> permute(int[] nums) {
    //     List<List<Integer>> ans = new ArrayList<>();
    //     rres(ans, new ArrayList<>(), nums);
    //     return ans;
    // }
    // public static void rres(List<List<Integer>> list, List<Integer> tempList, int [] nums){
    //     if(tempList.size() == nums.length)
    //         list.add(new ArrayList<>(tempList));
    //     else {
    //         for(int i=0;i<nums.length;++i) { 
    //             if(tempList.contains(nums[i]))  // element already exists, skip 
    //                 continue; 
    //             tempList.add(nums[i]);
    //             rres(list, tempList, nums);
    //             tempList.remove(tempList.size() - 1);
    //         }
    //     }
    // }
    public static List<List<Integer>> permute(int[] nums) {
        if(nums.length==0){
            List<List<Integer>>result=new ArrayList<>();
            result.add(new ArrayList<>());
            return result;
        }
        int singleint=nums[0];
        int subnums[]=new int[nums.length-1];
        for(int i=1;i<nums.length;i++){
            subnums[i-1]=nums[i];
        }
        List<List<Integer>>result=permute(subnums);
        List<List<Integer>>finalList=new ArrayList<List<Integer>>();
        for(List<Integer> s:result){
            for(int i=0;i<=s.size();i++){
                List<Integer>per=new ArrayList<>(s);
                per.add(i,singleint);
                finalList.add(new ArrayList<>(per));
        }
        }
        return finalList;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3};
        System.out.println(permute(nums));
    }
}
