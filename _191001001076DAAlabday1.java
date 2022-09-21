package com.company;
import java.util.Scanner;
class _191001001076DAAlabday1
{
    public static void mergeArrays(int[] arr1, int[] arr2, int n1, int n2, int[] res)
    {
        int i = 0, j = 0, k = 0;

        while (i<n1 && j <n2)
        {
            if (arr1[i] < arr2[j])
                res[k++] = arr1[i++];
            else
                res[k++] = arr2[j++];
        }
        while (i < n1)
            res[k++] = arr1[i++];

        while (j < n2)
            res[k++] = arr2[j++];
    }
    //*****************************************************************************************************************
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int ind = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[ind]) {
                    ind = j;
                }
            }
            int smallerNumber = arr[ind];
            arr[ind] = arr[i];
            arr[i] = smallerNumber;
        }
    }

    public static void main (String[] args)
    {
        System.out.println("enter the first array:");
        Scanner sc= new Scanner(System.in);
        int[] inp1= new int[5];
        for(int i=0;i<4;i++){
            inp1[i]=sc.nextInt();
        }
        selectionSort(inp1);
        int n1 = inp1.length;
        System.out.println("enter the second array");
        int[] inp2= new int[5];
        for(int i=0;i<4;i++){
            inp2[i]=sc.nextInt();
        }
        selectionSort(inp2);
        int n2 = inp2.length;

        int[] arr = new int[n1+n2];

        mergeArrays(inp1, inp2, n1, n2, arr);

        System.out.println("after merging:");
        for (int i=2; i < (n1-1)+(n2-1); i++)
            System.out.print(arr[i] + " ");
    }
}