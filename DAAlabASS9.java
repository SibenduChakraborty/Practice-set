package com.company;
import java.io.*;
import java.util.*;
class Graph {
    private int V;
    private LinkedList<Integer> adj[];
    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }
    void addEdge(int v, int w) {
        adj[v].add(w);
    }
    void BFS(int s) {
        boolean[] visited = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<Integer>();
        visited[s] = true;
        queue.add(s);
        while (queue.size() != 0) {

            s = queue.poll();
            System.out.print(s + " ");
            for (int n : adj[s]) {
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
}
class DAAlabASS9{
    public static void main(String[] args)
    {
        Graph g = new Graph(4);
        System.out.println("enter the number of connected pairs: ");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("enter the values of pairs: ");
        for(int i=0;i<n;i++){
            g.addEdge(sc.nextInt(),sc.nextInt());
        }

        System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");
        g.BFS(2);
    }
}
