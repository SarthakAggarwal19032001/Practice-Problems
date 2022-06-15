public class KWeakestRows {
    //0-Civilian   1-Soldier
    //more no of 1 more Stronger
    public static void main(String[] args) {
        int arr[][]={{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,1,1,1}};
        //HashMap<Integer,Integer>map=new HashMap<>();
        int result[]=new int[arr.length];
        int c=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j]==1){
                    c++;
                }
                else{
                    break;
                }
            }
            result[i]=c;
            c=0;
        }
        int min=result[0];
        int ans[]=new int[result.length];
        int u=0;
        for(int k=1;k<arr.length;k++){
            if(result[k]<min){
                min=result[k];
                ans[u++]=k;
            }
        }
            }  
          }

