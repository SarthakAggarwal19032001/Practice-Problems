public class NumberPattern2 {
    static int j;
    /*
    1
    23
    456
    78910
    */
    static void numpat(int n,int i){
        if(i>n){
            return;
        }
        printing(i);
        System.out.println();
        i++;
        numpat(n, i);
    }

    static void printing(int i){
        if(i==0){
            return;
        }
            System.out.print(j+1);
            j++;
            printing(i-1);
        }
        
    public static void main(String[] args) {
        int n=5;
        int i=1;
        numpat(n,i);
        }
}
