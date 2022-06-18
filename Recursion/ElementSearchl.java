public class ElementSearchl {
    //print last index
    static int search(int arr[],int i,int t){
        if(i==arr.length){
            return i-1;
        }
        int a=search(arr, i+1, t);
        if(arr[a]==t){
            System.out.println(a);
        }
        return a-1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,5,6,7,8,9,10};
        int i=0;
        int target=4;
        search(arr, i,target);
    }
}
