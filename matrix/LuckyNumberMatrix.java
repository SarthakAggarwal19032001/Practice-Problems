//package MATRIX;
public class LuckyNumberMatrix {
    //number minimum in row and maximum in coloumn is lucky number 
    public static void main(String[] args) {
        int arr[][]={{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        int k=0;
        for(int i=0;i<arr.length;i++){
            int j=0;
            int min=arr[i][j];
            for(j=1;j<arr[0].length;j++){
                if(arr[i][j]<min){
                    min=arr[i][j];
                     k=j;
                }
            }
            int c=0;
                    for(int u=0;u<arr.length;u++){
                    if(arr[u][k]>min){
                        c++;
                    }
                    }
                    if(c==0){
                        System.out.println(min);
                    }
                }
            }
            
        }

