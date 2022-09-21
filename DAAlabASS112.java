/*package com.company;
import java.util.Arrays;
public class DAAlabASS112 {
    public void alg(int[][] G, int V) {
        int X;
        boolean[] ms = new boolean[V];
        Arrays.fill(ms, false);
        X = 0;
        ms[0] = true;
        System.out.println("Edge : Weight");
        while (X < V - 1) {
            int min = 9999999;
            int x = 0;
            int y = 0;

            for (int i = 0; i < V; i++) {
                if (ms[i]) {
                    for (int j = 0; j < V; j++) {
                        if (!ms[j] && G[i][j] != 0) {
                            if (min > G[i][j]) {
                                min = G[i][j];
                                x = i;
                                y = j;
                            }
                        }
                    }
                }
            }
            System.out.println(x + " - " + y + " :  " + G[x][y]);
            ms[y] = true;
            X++;
        }
    }
    public static void main(String[] args)
    {
        DAAlabASS112 k = new DAAlabASS112();
        int V =5;

        int[][] graph = new int[][] {
                { 0, 2, 0, 6, 0 },
                { 2, 0, 3, 8, 5 },
                { 0, 3, 0, 0, 7 },
                { 6, 8, 0, 0, 9 },
                { 0, 5, 7, 9, 0 }
        };
        k.alg(graph);
    }
}
*/
