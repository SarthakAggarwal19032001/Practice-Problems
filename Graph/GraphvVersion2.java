import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import javax.swing.plaf.synth.SynthStyle;

class GraphVersion2{
    void addEdge(ArrayList<ArrayList<Integer>>adjList,int vertex1,int Vertex2){
        adjList.get(vertex1).add(Vertex2);
        adjList.get(Vertex2).add(vertex1);
    }

    void print(ArrayList<ArrayList<Integer>> adjList) {
        // for (ArrayList<Integer> inner : adjList) {
        // System.out.println(inner);
        // }
        for (int i = 0; i < adjList.size(); i++) {
            String items = "";
            for (int j = 0; j < adjList.get(i).size(); j++) {
                items += adjList.get(i).get(j) + " , ";
            }
            System.out.println(i + " => " + items);
        }
    }

    void print(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            System.out.print(i+"=> ");
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==1){
                    System.out.print(j+",");
                }
            }
            System.out.println();
        }
    }

    boolean isEdgeExist(ArrayList<ArrayList<Integer>>adjList,int v1,int v2){
        if(adjList.get(v1).contains(v2))
        return true;
        return false;
        
    }

    boolean isEdgeExist(int[][] matrix,int vertex1,int vertex2){
        if(vertex1>=matrix.length || vertex2>=matrix.length){
            return false;
        }
        else if(matrix[vertex1][vertex2]==1){
            return true;
        }
        else
        return false;
    }

    boolean bfs(ArrayList<ArrayList<Integer>>adjList,int start,int target){
        Queue<Integer>queue=new LinkedList<>();
        boolean visited[]=new boolean[adjList.size()];
        queue.offer(start);
        visited[start]=true;
        while(!queue.isEmpty()){
            int a=queue.poll();
            if(isEdgeExist(adjList, a, target)){
                return true;
            }
            ArrayList<Integer>neighbours=adjList.get(a);
            for(int s:neighbours){
                if(!visited[s]){
                queue.offer(s);
                visited[s]=true;
                }
            }

        }
        return false;
    }


   
    boolean dfs(ArrayList<ArrayList<Integer>>adjList,int start,int target){
        Stack<Integer>stack=new Stack<>();
        boolean []visted=new boolean[adjList.size()];
        stack.push(start);
        visted[start]=true;
        while(!stack.isEmpty()){
            int a=stack.pop();
            if(isEdgeExist(adjList, a, target)){
                return true;
            }
            ArrayList<Integer>neighbours=adjList.get(a);
            for(int s:neighbours){
                if(!visted[s]){
                    stack.push(s);
                    visted[s]=true;
                }
            }
        }
        return false;
    }


    boolean bfs(int [][]matrix,int start,int target){
        Queue<Integer>queue=new LinkedList<>();
        boolean [] visited=new boolean[matrix.length];
        queue.offer(start);
        visited[start]=true;
        while(!queue.isEmpty()){
            int a=queue.poll();
            if(isEdgeExist(matrix,a, target))
            return true;

                for(int j=0;j<matrix.length;j++){
                    if(matrix[a][j]==1){
                        if(visited[j]!=true){
                            queue.offer(j);
                            visited[j]=true;
                        }
                    }
                }
            }
            return false;
    }

    void bft(ArrayList<ArrayList<Integer>>adjList){
        Queue<Integer>queue=new LinkedList<>();
        boolean visited[]=new boolean[adjList.size()];
        queue.offer(0);
        visited[0]=true;
        while(!queue.isEmpty()){
            int a=queue.poll();
            System.out.print(a+" ");
            ArrayList<Integer>neighbours=adjList.get(a);
            for(int s:neighbours){
                if(!visited[s]){
                queue.offer(s);
                visited[s]=true;
                }
            }

        }
    }

    

    boolean dfs(int [][]matrix,int start,int target){
        Stack<Integer>stack=new Stack<>();
        boolean [] visited=new boolean[matrix.length];
        stack.push(start);
        visited[start]=true;
        while(!stack.isEmpty()){
            int a=stack.pop();
            if(isEdgeExist(matrix,a, target))
            return true;

                for(int j=0;j<matrix.length;j++){
                    if(matrix[a][j]==1){
                        if(visited[j]!=true){
                            stack.push(j);
                            visited[j]=true;
                        }
                    }
                }
            }
            return false;
    }


    void dft(int matrix[][]){
        Stack<Integer>stack=new Stack<>();
        boolean[] visited=new boolean[matrix.length];
        stack.push(0);
        visited[0]=true;
        while(!stack.isEmpty()){
            int a=stack.pop();
            System.out.print(a+",");
            for(int j=0;j<matrix[a].length;j++){
                if(matrix[a][j]==1 && visited[j]!=true){
                    stack.push(j);
                    visited[j]=true;
                }
            }
        }
    }

    public static void main(String[] args) {
        //Adjancy Matrix
        int[][]matrix={{0,1,1,0},
                      {1,0,1,1},
                      {1,1,0,0},
                      {0,1,0,0}};

        //Using Adjancy List (Optimized)
        ArrayList<ArrayList<Integer>>adjList=new ArrayList<>();
        int totalVertex = 4;
        for (int i = 0; i < totalVertex; i++) {
            adjList.add(new ArrayList<>());
        }
        GraphVersion2 graph=new GraphVersion2();
        graph.addEdge(adjList, 0, 1);
        graph.addEdge(adjList, 0, 2);
       // graph.addEdge(adjList, 1, 0);
        graph.addEdge(adjList, 1, 2);
        graph.addEdge(adjList, 1, 3);
        //graph.addEdge(adjList, 2, 0);
        //graph.addEdge(adjList, 2, 1);
        //graph.addEdge(adjList, 3, 1);
        System.out.println(adjList);
        graph.print(adjList);
        System.out.println(graph.isEdgeExist(adjList, 1, 3));
        System.out.println(graph.bfs(adjList, 0, 3));
        System.out.println(graph.bfs(adjList, 0, 7));
        System.out.println("Through DFS..................");
        System.out.println(graph.dfs(adjList, 0, 3));
        System.out.println(graph.dfs(adjList, 0, 7));

        System.out.println("--------------------------Adjancy Matrix---------------------------------------");
        graph.print(matrix);
        System.out.println(graph.isEdgeExist(matrix, 1, 3));
        System.out.println(graph.bfs(matrix, 0, 3));
        System.out.println(graph.bfs(matrix, 0, 7));
        System.out.println("Through DFS..................");
        System.out.println(graph.dfs(matrix, 0, 3));
        System.out.println(graph.dfs(matrix, 0, 7));
        System.out.println("DFT");
        graph.dft(matrix);
        System.out.println("BFT");
        graph.bft(adjList);

    }
}