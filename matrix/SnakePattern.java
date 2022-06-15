public class SnakePattern {
    public static void main(String[] args) {
        int arr[][]={{10,20,30,40},{50,60,70,80},{27,29,37,48},{32,33,31,40}};
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                for(int j=0;j<arr.length;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            else{
                for(int j=arr.length-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                } 
                System.out.println();
            }
        }
    }
}
