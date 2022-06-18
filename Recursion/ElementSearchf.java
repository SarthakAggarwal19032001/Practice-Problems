public class ElementSearchf {
    //print first
    static int search(int arr[],int i,int t){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==t){
            return i;
        }
        return search(arr, i+1, t);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,5,6,7,8,9,10};
        int i=0;
        int target=4;
        System.out.println(search(arr, i,target));
    }
}
