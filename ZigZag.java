public class ZigZag {
    //a<b>c<d>e<f>g
    //3<7>4<8>2<6>1
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int temp;
        for(int i=0;i<arr.length-1;i++){
            if(i%2==0){
                if(arr[i]>arr[i+1]){
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }}
            else if(i%2!=0){
                if(arr[i]<arr[i+1]){
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }}
        }
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);

    }
}
