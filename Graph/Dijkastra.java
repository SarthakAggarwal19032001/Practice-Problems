public class Dijkastra {
    static final int TotalVertex=6;
    void DijkastraAlgo(int matrix[][]){
        int weight[]=new int[TotalVertex];
        weight[0]=0;
        for(int i=1;i<TotalVertex;i++){
            weight[i]=Integer.MAX_VALUE;
        }

        boolean visited[]=new boolean[TotalVertex];

        int parent[]=new int[TotalVertex];
        parent[0]=-1;

        for(int i=0;i<TotalVertex-1;i++){
            int currentVertex=getMinVertex(weight,visited);
            visited[currentVertex]=true;

            for(int j=0;j<TotalVertex;j++){
                if(matrix[currentVertex][j]!=0 && !visited[j] && matrix[currentVertex][j]+weight[currentVertex]<weight[j]){
                    weight[j]=matrix[currentVertex][j]+weight[currentVertex];
                    parent[j]=currentVertex;
                }
            }
        }
        for(int i=1;i<TotalVertex;i++){
            System.out.println(parent[i]+ "->"+"("+matrix[parent[i]][i]+") "+i);
        }

    }


    int getMinVertex(int []weight, boolean [] visited){
        int min=Integer.MAX_VALUE;
        int vertex=-1;
        for(int i=0;i<TotalVertex;i++){
            if(weight[i]<min && !visited[i]){
                min=weight[i];
                vertex=i;
            }
        }
        return vertex;
    }
    public static void main(String[] args) {
        int graph[][]={{0,1,4,0,0,0},
                       {1,0,4,2,7,0},
                       {4,4,0,3,5,0},
                       {0,2,3,0,4,6},
                       {0,7,5,4,0,7},
                       {0,0,0,6,7,0}
        };
        Dijkastra d=new Dijkastra();
        d.DijkastraAlgo(graph);
    }
}
