public class StringCompression {
    public static void main(String[] args) {
        char[] chars={'a','a','b','b','b','c','c'};
        StringBuilder s=new StringBuilder();
        int c=0;
        char ch=chars[0];
        for(int i=0;i<chars.length;i++){
            if(ch==chars[i]){
                c++;
            }
            else{
                if(c==1){
                    s.append(ch);
                    ch=chars[i];
                    c=1;
                }
                else if(c>10){
                    int u=c%10;
                    int a=c/10;
                    s.append(ch).append(a).append(u);
                    ch=chars[i];
                    c=1;
                }
                else{
                s.append(ch).append(c);
                ch=chars[i];
                c=1;
                }
            }
            if(i==chars.length-1){
                if(c==1){
                    s.append(ch);
                    ch=chars[i];
                    c=1;
                }
                else if(c>10){
                    int u=c%10;
                    int a=c/10;
                    s.append(ch).append(a).append(u);
                    ch=chars[i];
                    c=1;
                }
                else{
                s.append(ch).append(c);
                ch=chars[i];
                c=1;
                }
            }
    }
    for(int i=0;i<s.length();i++){
        chars[i]=s.charAt(i);
       // System.out.println(chars[i]);
    }
    for(int i=0;i<s.length();i++){
       System.out.println(chars[i]);
    }
}
}