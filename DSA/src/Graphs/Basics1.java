package Graphs;

//
//        What Does "Representation" Mean?
//
//        A graph is basically made up of:
//
//        Vertices (Nodes) → points
//
//        Edges → connections between nodes
//
//        So, when we represent a graph in code, we’re just storing:
//
//        "Which node is connected to which other nodes."
//
//        Depending on how we store it, we have three main methods.
//--------------------------------------------------------------------------------------------->

//        Adjacency Matrix Representation
//        Concept
//        We use a 2D matrix (say graph[V][V]), where
//        graph[i][j] = 1 means there’s an edge from i to j,
//        and 0 means no edge.


import java.util.*;
public class Basics1 {
    public static void main(String[] args){
        int V=4;            //Nodes or Vertices
        int [][] graph=new int[V][V];

        //Adding Edges (Directed)
        addEdge(graph,0,1);
        addEdge(graph,0,2);
        addEdge(graph,1,2);
        addEdge(graph,2,3);

        //Print the adjacency Matrix
        printGraph(graph);
    }
    static void addEdge(int[][] graph,int u,int v){
        graph[u][v]=1;
        //graph[v][u]=1;   //For undirected Graph
    }
    static void printGraph(int[][]graph){
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[i].length;j++){
                System.out.print(graph[i][j]+" ");
            }
            System.out.println();
        }
    }
}


