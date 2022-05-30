public class ReverseArray {
    public static void main(String[] args) {
        int temp;
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int l=arr.length;
        for(int i=0;i<l/2;i++){
            temp=arr[i];
            arr[i]=arr[l-i-1];
            arr[l-i-1]=temp;
        }
        for(int i=0;i<l;i++){
        System.out.println(arr[i]);
        }
    }
}
