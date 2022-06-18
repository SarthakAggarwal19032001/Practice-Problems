public class NumberPattern {
    static int j;
    /*
    1
    22
    333
    4444
    55555
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
            j=0;
            return;
        }
            System.out.print(i+j);
            j++;
            printing(i-1);
        }
        
    public static void main(String[] args) {
        int n=5;
        int i=1;
        numpat(n,i);
        }
}
