package com.company;
import java.util.Scanner;
import java.util.Scanner;
public class DAAlabday3 {
    static int max(int[] a, int l, int r) {
        if (l == r)
            return a[l];
        int m = (l + r) / 2;
        System.out.println(l +" __ "+ m);

        int u = max(a, l, m);
        System.out.println("comparison element 1 -->" +u);
        System.out.println( m+1 + " __ " + r );

        int v = max(a, m + 1, r);

        System.out.println("comparision element 2 -->"+ v);
        //System.out.println("MAXIMUM IS: " + Math.max(u,v));
        return Math.max(u, v);
    }

    public static void main (String[]args){
        Scanner sc= new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("enter the elements:");
        for(int i=0;i<a.length;i++){
            a[i]= sc.nextInt();
        }
        int n = a.length;
        System.out.println("\n\n\nMAXIMUM IS: "+max(a, 0, n - 1));

    }
}
