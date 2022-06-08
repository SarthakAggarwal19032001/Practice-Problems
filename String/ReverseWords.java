class ReverseWords{
    public static void main(String[] args) {
        String s="a good  example";
        String result="";
        s=s.trim();
        s=s.replaceAll("\\s+", " ");
        int i=0;
        String temp;
        String e[]=s.split(" ");
        int j=e.length-1;
        while(i<j){
            temp=e[i];
            e[i]=e[j];
            e[j]=temp;
            i++;
            j--;
        }
        for(int u=0;u<e.length;u++){
            result=result+e[u]+" ";
        }
        result=result.trim();
        System.out.println(result);
    }
}