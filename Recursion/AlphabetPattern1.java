public class AlphabetPattern1 {
    /*
    A
    AB
    ABC
    ABCD
    ABCDE
    */
    static int j=0;
    static void  charpat(int n,int i){
        if(i>n){
            return;
        }
        printing(i);
        System.out.println();
        i++;
        charpat(n, i);
    }
    static void printing(int i){
        if(i==0){
            j=0;
            return;
        }
        System.out.print((char)(65+j));
        j++;
        printing(i-1);
    }
    public static void main(String[] args) {
        int n=5;
        int i=1;
        charpat(n,i);
        }
}
