class PalindromeString{
    public static void main(String[] args) {
        String s="nitin";
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if((s.charAt(i)!=(s.charAt(j)))){
                System.out.println("Not a Palindrome");
                return;
            }
            i++;
            j--;
        }
        System.out.println("Palindrome String");
    }

    public boolean isPalindrome(String temp) {
        return false;
    }
}