package com.company;

import java.util.Scanner;

class DAAlabASS8 {

    static int max(int a, int b)
    {
        return Math.max(a, b);
    }

    static int knapSack(int W, int[] wt, int[] val, int n)
    {
        if (n == 0 || W == 0)
            return 0;
        if (wt[n - 1] > W)
            return knapSack(W, wt, val, n - 1);
        else
            return max(val[n - 1]
                            + knapSack(W - wt[n - 1], wt,
                            val, n - 1),
                    knapSack(W, wt, val, n - 1));
    }
    public static void main(String[] args)
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
