class KnapSack{
    static int matrix[][];
    static int tabulation(int prices[],int weights[],int maxweight){
        matrix=new int[prices.length+1][maxweight+1];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(i==0 || j==0){
                    matrix[i][j]=0;
                    continue;
                }
                if(j<weights[i-1]){
                    matrix[i][j]=matrix[i-1][j];
                }
                else{
                    matrix[i][j]=Math.max(prices[i-1]+matrix[i-1][j-weights[i-1]], matrix[i-1][j]);
                }
            }
        }
        return matrix[prices.length][maxweight];
        
    }

    static int knapsack(int []prices,int []weights,int maxWeight,int index){
        if(index==prices.length || maxWeight==0){
            return 0;
        }
        if(weights[index]>maxWeight){
            return knapsack(prices, weights, maxWeight, index+1);
        }
        else{
            int option1 = prices[index] + knapsack(prices,weights,maxWeight - weights[index], index + 1);
            int option2 = knapsack(prices,weights,maxWeight, index + 1);
                return Math.max(option1, option2);
        }
     
    }
    // 0/1 KnapSack Problem
    public static void main(String[] args) {
        int maxWeight = 3;
        int prices[] = { 60, 100, 120 };
        int weights[] = { 1, 2, 2 };
        System.out.println(knapsack(prices,weights,maxWeight,0));
        System.out.println("Through Tabulation.......................");
        System.out.println(tabulation(prices, weights, maxWeight));
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
