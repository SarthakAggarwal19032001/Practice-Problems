public class Prims {
    final static int TotalVertex=6;

    static void PrimsAlgo(int [][]matrix){
        //Three Arrays Will Be created
        //1 Weight array all marked as max except source/starting vertex
        int weight[]=new int[TotalVertex];
        weight[0]=0;
        for(int i=1;i<TotalVertex;i++){
            weight[i]=Integer.MAX_VALUE;
        }
        //Mset were we will maintain the vertexes status i,e visited or not.
        boolean mset[]=new boolean[TotalVertex];
        //Parent array contains the vertexes part of MST
        int parent[]=new int[TotalVertex];
        //parent of source/starting is none therefore -1 
        parent[0]=-1;

        // Loop for MST (V-1) Edges   => since the MST will have v-1 edges therefore loop will run totalvertex-1
        for(int i=0;i<TotalVertex-1;i++){
            // get the source vertex (Minimum)
            int currentVertex=getMinVertex(weight,mset);
            mset[currentVertex]=true;
            // After Getting the Source Vertex than get the Adjacent Vertex 
            //and do the Relax Operations (Weights Update)

            for(int j=0;j<TotalVertex;j++){
                if(matrix[currentVertex][j]!=0 && !mset[j] && matrix[currentVertex][j]<weight[j]){
                    weight[j]=matrix[currentVertex][j];
                    parent[j]=currentVertex;
                }
            }
        }
            for(int i=1;i<TotalVertex;i++){
                System.out.println(parent[i]+" "+i+"  "+matrix[parent[i]][i]);
            }
        }

    static int getMinVertex(int []weight, boolean mset[]){
        int min=Integer.MAX_VALUE;
        int vertex=-1;
        for(int i = 0; i<TotalVertex; i++){
            if(!mset[i] && weight[i]<min){
                vertex = i;
                min = weight[i];
            }
        }
        return vertex; // Become Source Vertex
    }
    public static void main(String[] args) {
        int graph[][] = {
            {0,4,6,0,0,0},
            {4,0,6,3,4,0},
            {6,6,0,1,0,0},
            {0,3,1,0,2,3},
            {0,4,0,2,0,7},
            {0,0,0,3,7,0}
         };
         PrimsAlgo(graph);

    }
}
