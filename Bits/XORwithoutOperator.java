public class XORwithoutOperator {
    public static void main(String[] args) {
        int x=3;
        int y=5;
        System.out.println((x|y) & (~x|~y));
    }
}
