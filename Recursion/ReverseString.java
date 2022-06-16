public class ReverseString {
    static StringBuilder result=new StringBuilder();
    static StringBuilder reverse(String str,int j){
        if(j<0){
            return result;
        }
        char s=str.charAt(j);
        result.append(s);
        return reverse(str, j-1);
    }
    public static void main(String[] args) {
        String str="Sarthak";
        int j=str.length()-1;
        System.out.println(reverse(str,j));
    }
}
