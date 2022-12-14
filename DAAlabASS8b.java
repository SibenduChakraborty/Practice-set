package com.company;
import java.util.Scanner;
class DAAlabASS8b {

    static int max(int a, int b)
    {
        return Math.max(a, b);
    }

    static int knapSack(int W, int[] wt,
                        int[] val, int n)
    {
        int i, w;
        int[][] K = new int[n + 1][W + 1];


        for (i = 0; i <= n; i++)
        {
            for (w = 0; w <= W; w++)
            {
                if (i == 0 || w == 0)
                    K[i][w] = 0;
                else if (wt[i - 1] <= w)
                    K[i][w]
                            = max(val[i - 1]
                                    + K[i - 1][w - wt[i - 1]],
                            K[i - 1][w]);
                else
                    K[i][w] = K[i - 1][w];
            }
        }

        return K[n][W];
    }

    public static void main(String args[])
    {
        System.out.println("enter the values: ");
        Scanner sc= new Scanner(System.in);
        // int x,y,z = sc.nextInt();
        int[] val = new int[] { sc.nextInt(), sc.nextInt(), sc.nextInt() };
        System.out.println("enter the work time: ");
        int[] wt = new int[] { sc.nextInt(), sc.nextInt(), sc.nextInt() };
        System.out.println("enter weight: ");
        int W = sc.nextInt();
        int n = val.length;
        System.out.println(knapSack(W, wt, val, n));
    }
}
