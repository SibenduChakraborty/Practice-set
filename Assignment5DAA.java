package com.company;
import java.util.Scanner;
class work{
    int ST;
    int FT;
    work(int a , int b){
        ST=a;
        FT=b;
        //System.out.println(ST+" "+FT);
    }
}
 class Assignment5DAA {
     void Activities(int[] s, int[] f, int n)
    {
        int i, j;

        System.out.println("Following activities are selected : ");

        i = 1;
        System.out.print(i+" ");
        for (j = 1; j < n; j++)
        {
            if (s[j] >= f[i])
            {
                System.out.print(j+1+" ");
                i = j;
            }
        }
    }
static void sort(work[] arr) {
    for (int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < arr.length; j++) {
            work tmp= new work(0,0);
            if (arr[i].FT > arr[j].FT) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
    }
}
    public static void main(String[] args) {
        System.out.println("the works:");
        work[] act= new work[6];
        act[0]= new work(5,9);
        act[1]= new work(1,2);
        act[2]= new work(3,4);
        act[3]= new work(0,2);
        act[4]= new work(5,7);
        act[5]= new work(8,9);
        System.out.println("the works to be done: ");
        for(int i=0; i<=5; i++){
            System.out.println(act[i].ST+"  " +act[i].FT);
        }
        sort(act);
        int[] st= new int[6];
        for(int i=0; i<=5; i++){
            st[i]= act[i].ST;
        }
        int[] ft= new int[6];
        for(int i=0; i<=5; i++){
            ft[i]= act[i].FT;
        }
        System.out.println("after sorting the works: ");
        for(int i=0; i<=5; i++){
            System.out.println(act[i].ST + "  " +act[i].FT);
        }
        int x= st.length;
        Assignment5DAA factor= new Assignment5DAA();
        factor.Activities(st, ft, x);
    }
}