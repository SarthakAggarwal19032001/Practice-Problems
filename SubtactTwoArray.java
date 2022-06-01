public class SubtactTwoArray {
    public static void main(String[] args) {
        int first[]={8,4,6,6,5};
        int second[]={8,4,4,5,5};
        int fl=first.length;
        int sl=second.length;
        int third[]=new int[fl>sl?fl:sl];
        int i=fl-1;
        int j=sl-1;
        int k=third.length-1;
        if((fl>=sl) && (first[0]>=second[0])){// for positive answer
        while(i>=0 || j>=0){
            int digitminus=0;
            if(i>=0){
                digitminus=first[i];
            }
            if(j>=0){
                if((first[i]<second[j]) && (i!=0)){
                    digitminus=first[i]+10;
                    first[i-1]=first[i-1]-1;
                }
                digitminus=digitminus-second[j];
            }
            third[k]=digitminus;
            i--;
            j--;
            k--;
        }

           int e=0;
        while(third[e]==0){
            e++;
        }
        for(int p=e;p<third.length;p++){
            System.out.print(third[p]+" ");
        }
        
        }

        else if(sl>fl || first[0]<second[0]){ // for negative answer
            while(i>=0 || j>=0){
                int digitminus=0;
                if(j>=0){
                    digitminus=second[j];
                }
                if(i>=0){
                    if((second[j]<first[i]) && (j!=0)){
                        digitminus=second[j]+10;
                        second[j-1]=second[j-1]-1;
                    }
                    digitminus=digitminus-first[i];
                }
                third[k]=digitminus;
                if(j==0){
                    if(third[k]==0){
                        third[k+1]=third[k+1]*(-1);
                    }
                    third[k]=third[k]*(-1);
                }
                i--;
                j--;
                k--;
            }

            int e=0;
            while(third[e]==0){
                e++;
            }
            for(int p=e;p<k;p++){
                System.out.print(third[p]+" ");
            }

        }

        
        else { //if they are equal
            for(int eq=0;eq<k;eq++){
                System.out.println(third[eq]);
            }
        }

    }
}
