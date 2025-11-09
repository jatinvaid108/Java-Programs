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


class WeightedMatrixGraph {
    public static void main(String[] args) {
        int V = 4;
        int[][] graph = new int[V][V];

        addEdge(graph, 0, 1, 4);
        addEdge(graph, 0, 2, 2);
        addEdge(graph, 1, 2, 5);
        addEdge(graph, 1, 3, 10);
        addEdge(graph, 2, 3, 3);

        printGraph(graph);
    }

    static void addEdge(int[][] graph, int u, int v, int w) {
        graph[u][v] = w;
        graph[v][u] = w;  // undirected
    }

    static void printGraph(int[][] graph) {
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }
}


class Pair {
    int node, weight;
    Pair(int node, int weight) {
        this.node = node;
        this.weight = weight;
    }
}

class WeightedListGraph {
    public static void main(String[] args) {
        int V = 4;
        ArrayList<ArrayList<Pair>> graph = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        addEdge(graph, 0, 1, 4);
        addEdge(graph, 0, 2, 2);
        addEdge(graph, 1, 2, 5);
        addEdge(graph, 1, 3, 10);
        addEdge(graph, 2, 3, 3);

        printGraph(graph);
    }

    static void addEdge(ArrayList<ArrayList<Pair>> graph, int u, int v, int w) {
        graph.get(u).add(new Pair(v, w));
        graph.get(v).add(new Pair(u, w)); // for undirected
    }

    static void printGraph(ArrayList<ArrayList<Pair>> graph) {
        for (int i = 0; i < graph.size(); i++) {
            System.out.print(i + " -> ");
            for (Pair p : graph.get(i)) {
                System.out.print("(" + p.node + ", " + p.weight + ") ");
            }
            System.out.println();
        }
    }
}