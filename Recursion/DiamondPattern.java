public class DiamondPattern {
    /*
        *
       ***
      *****
     *******
      *****
       ***
        *
        */
      

    static void diamond(int n,int i){
        if(n==0){
            halfdiamond(n+2,i-4);
            return;
        }
        printspace(n);
        printstar(i);
        System.out.println();
        n--;
        i=i+2;
        diamond(n, i);
    }

    static void halfdiamond(int n,int i){
        if(i<=0){
            return;
        }
        printspace(n);
        printstar(i);
        System.out.println();
        n++;
        i=i-2;
        halfdiamond(n, i);
    }
    static void printspace(int n){
        if(n==1){
            return;
        }
        System.out.print(" ");
        n--;
        printspace(n);
    }
    static void printstar(int i){
        if(i==0){
            return;
        }
        System.out.print("*");
        i--;
        printstar(i);
    }
    public static void main(String[] args) {
        int n=4;
        int i=1;
        diamond(n,i);
    }
}
