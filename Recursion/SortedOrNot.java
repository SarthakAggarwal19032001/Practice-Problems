public class SortedOrNot {
    static boolean result=false;
    static boolean sorted(int arr[],int len){
        if(len==0){
            return true;
        }
        if(arr[len]>=arr[len-1]){
            result=true;
        }
        else{
            return false;
        }
        return sorted(arr,len-1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int l=arr.length-1;
        System.out.println(sorted(arr,l)?"Sorted":"Not Sorted");
    }
}
