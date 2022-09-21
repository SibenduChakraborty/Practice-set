package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;


public class ass13
{
    final static int inf = 99999, V = 6;

    void fwg(int graph[][])
    {
        int d[][] = new int[V][V];
        int i, j, k;

        for (i = 0; i < V; i++)
            for (j = 0; j < V; j++)
                d[i][j] = graph[i][j];

        for (k = 0; k < V; k++)
        {
            for (i = 0; i < V; i++)
            {
                for (j = 0; j < V; j++)
                {
                    if (d[i][k] + d[k][j] < d[i][j])
                        d[i][j] = d[i][k] + d[k][j];
                }
            }
        }

        printSolution(d);
    }

    void printSolution(int d[][])
    {
      //  System.out.println("The following matrix shows the shortest "+
      //          "distances between every pair of vertices");
        for (int i=0; i<V; ++i)
        {
            for (int j=0; j<V; ++j)
            {
                if (d[i][j]>9000)
                    System.out.print("INF ");
                else
                    System.out.print(d[i][j]+"   ");
            }
            System.out.println();
        }
    }

    public static void main (String[] args)
    {
        int[][] graph = {
                //       s     A    B    C     D    t
                /*s*/    {0,   5,  inf, -2 , inf , inf},
                /*A*/    {inf, 0,   1, inf ,inf , inf},
                /*B*/    {inf, inf, 0, inf,  -1 ,   3},
                /*C*/    {inf, 2  , 4  , 0  , 4 ,  inf},
                /*D*/    {inf, inf ,inf, inf, 0 ,  1},
                /*t*/    {inf, inf, inf ,inf, inf , 0 }
        };
       ass13 a = new ass13();

        a.fwg(graph);
    }
}