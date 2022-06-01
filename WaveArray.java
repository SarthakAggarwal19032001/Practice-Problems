public class WaveArray {
    //arr[1]>=arr[2]<=arr[3]>=arr[4]<=arr[5]
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int temp;
        for(int i=0;i<arr.length-1;i++){
            if(i%2==0){
                if(arr[i]<arr[i+1]){
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }}
            else if(i%2!=0){
                if(arr[i]>arr[i+1]){
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }}
        }
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);

    }
}
