class DiceGame{
    //Counting all posibilites
    static int dice(int start,int endvalue){
        if(start==endvalue){
            return 1;
        }
        if(start>endvalue){
            return 0;
        }
        int count=0;
        for(int i=1;i<=6;i++){
            int newvalue=start+i;
            count=count+dice(newvalue,endvalue);
        }
        return count;
    }
    //Memorization Technique (Top Down Approach)
    //This resolves Overlapping Problem i.e it removes calculation of similar type in the cycle/recursion.

    static int dicememo(int start,int endvalue,int []cache){
        int count=0;
        if(start==endvalue){
            return 1;
        }
        if(start>endvalue){
            return 0;
        }
        if(cache[start]!=0){
            return cache[start];
        }
        for(int i=1;i<=6;i++){
            int newvalue=start+i;
            count=count+dicememo(newvalue, endvalue,cache);
        }
        cache[start]=count;
        return count;
    }

    //Tabulation Method eleminate recursion by using and filling an array.  (Bottom Up Approach)
    static int tabulation(int start,int endvalue){
        int arr[]=new int[endvalue+1];
        arr[endvalue]=1;
        for(int i=endvalue-1;i>=0;i--){
            int sum=0;
            for(int j=i+1;j<arr.length && (j-i<=6);j++){
                sum=sum+arr[j];
            }
            arr[i]=sum;
        }
        return arr[0];
    }

    public static void main(String[] args) {
        int start=0;
        int endvalue=10;
        int cache[]=new int[endvalue+1];
        int result=dice(start,endvalue);
        System.out.println("Through Recursion "+result);
        int result2=dicememo(start, endvalue, cache);
        System.out.println("Through Memorization "+result2);
        int result3=tabulation(start, endvalue);
        System.out.println("Through Tabulation Method"+result3);
    }
}