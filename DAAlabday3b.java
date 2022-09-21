package com.company;
import java.util.Scanner;
import java.util.Scanner;
class QuickSort
{
    int partition(int arr[], int l, int h)
    {
        int p = arr[h];
        int i = (l-1);
        for (int j=l; j<h; j++)
        {
            if (arr[j] <= p)
            {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[h];
        arr[h] = temp;

        return i+1;
    }
    void sort(int arr[], int l, int h)
    {
        if (l < h)
        {
            int pi = partition(arr, l, h);

            sort(arr, l, pi-1);
            sort(arr, pi+1, h);
        }
    }
}
public class DAAlabday3b {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("enter the elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
            int n = arr.length;

            QuickSort ob = new QuickSort();
            ob.sort(arr, 0, n-1);

            System.out.println("sorted array");
        int N = arr.length;
        for (int i=0; i<N; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}

