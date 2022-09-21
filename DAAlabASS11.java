package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

public class DAAlabASS11 {
    private static final int V = 5;

    int mk(int[] key, Boolean[] ms)
    {
        int min = Integer.MAX_VALUE, mind = -1;

        for (int v = 0; v < V; v++)
            if (!ms[v] && key[v] < min) {
                min = key[v];
                mind = v;
            }

        return mind;
    }
    void alg(int[] parent, int[][] graph)
    {
        System.out.println("Edge \tWeight");
        for (int i = 1; i < V; i++)
            System.out.println(parent[i] + " - " + i + "\t" + graph[i][parent[i]]);
    }
    void alg(int[][] graph)
    {

        int[] p = new int[V];

        int[] k = new int[V];

        Boolean[] ms = new Boolean[V];

        for (int i = 0; i < V; i++) {
            k[i] = Integer.MAX_VALUE;
            ms[i] = false;
        }

        k[0] = 0;
        p[0] = -1;

        for (int c = 0; c < V - 1; c++) {

            int u = mk(k, ms);

            ms[u] = true;
            for (int v = 0; v < V; v++)

                if (graph[u][v] != 0 && !ms[v] && graph[u][v] < k[v]) {
                    p[v] = u;
                    k[v] = graph[u][v];
                }
        }
        alg(p, graph);
    }

    public static void main(String[] args)
    {
        DAAlabASS11 k = new DAAlabASS11();
        int[][] graph = new int[][] {
                { 0, 2, 0, 6, 0 },
                { 2, 0, 3, 8, 5 },
                { 0, 3, 0, 0, 7 },
                { 6, 8, 0, 0, 9 },
                { 0, 5, 7, 9, 0 } };
        k.alg(graph);
    }
}