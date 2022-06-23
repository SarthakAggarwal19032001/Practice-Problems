public class Palindrome {
    static String reverse(String str){
        if(str.length()==1){
            return str;
        }
        String smallString=str.substring(1);
        char singlechar=str.charAt(0);
        return reverse(smallString)+singlechar;
    
    }
    public static void main(String[] args) {
        String s="ababa";
        String rev=reverse(s);
        if(s.equals(rev)){
            System.out.println("Palindrome");
        }
        else
        System.out.println("Not Palindrome");
    }
}
