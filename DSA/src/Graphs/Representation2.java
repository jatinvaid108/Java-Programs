package Graphs;
import java.util.*;
public class Representation2 {

}

class GraphList{
    public static void main(String[] args) {
        int V=4;
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();

        //Initialize empty lists for each vertex
        for(int i=0;i<V;i++){
            graph.add(new ArrayList<>());
        }

        //Add Edges
        addEdge(graph,0,1);
        addEdge(graph,0,2);
        addEdge(graph,1,2);
        addEdge(graph,2,3);

        //printGraph
        printGraph(graph);
    }

    static void addEdge(ArrayList<ArrayList<Integer>> graph,int u,int v){
        graph.get(u).add(v);   // directed edge u → v
        // For undirected graph, also do: graph.get(v).add(u);
    }
    static void printGraph(ArrayList<ArrayList<Integer>> graph){
        for (int i = 0; i < graph.size(); i++) {
            System.out.print(i + " -> ");
            for (int node : graph.get(i)) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }
}
