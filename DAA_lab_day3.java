package com.company;
import java.util.Scanner;
class DAA_lab_day3
{
    private static int[] mergeArray(int[] A, int[] B)
    {
        int[] mergedArray = new int[A.length + B.length];

        int i=0, j=0, k=0;

        while (i < A.length && j < B.length)
        {
            if (A[i] < B[j])
            {
                mergedArray[k] = A[i];
                i++;
                k++;
            }
            else
            {
                mergedArray[k] = B[j];
                j++;
                k++;
            }
        }
        while (i < A.length)
        {
            mergedArray[k] = A[i];
            i++;
            k++;
        }
        while (j < B.length)
        {
            mergedArray[k] = B[j];
            j++;
            k++;
        }
        return mergedArray;
    }
    //*****************************************************************************************************************

        static void bubbleSort(int[] arr) {
            int n = arr.length;
            int temp = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 1; j < (n - i); j++) {
                    if (arr[j - 1] > arr[j]) {
                        //swap elements
                        temp = arr[j - 1];
                        arr[j - 1] = arr[j];
                        arr[j] = temp;
                    }

                }
            }

        }
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 2; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    //****************************************************************************************************************
    // MERGE SORT ALGORITHM USING DIVIDE AND CONQUER
    //****************************************************************************************************************
    static class MergeSort {


        void merge(int arr[], int p, int q, int r) {

            int n1 = q - p + 1;
            int n2 = r - q;

            int L[] = new int[n1];
            int M[] = new int[n2];

            for (int i = 0; i < n1; i++)
                L[i] = arr[p + i];
            for (int j = 0; j < n2; j++)
                M[j] = arr[q + 1 + j];


            int i, j, k;
            i = 0;
            j = 0;
            k = p;


            while (i < n1 && j < n2) {
                if (L[i] <= M[j]) {
                    arr[k] = L[i];
                    i++;
                } else {
                    arr[k] = M[j];
                    j++;
                }
                k++;
            }

            while (i < n1) {
                arr[k] = L[i];
                i++;
                k++;
            }

            while (j < n2) {
                arr[k] = M[j];
                j++;
                k++;
            }
        }

        void mergeSort(int arr[], int l, int r) {
            if (l < r) {


                int m = (l + r) / 2;

                mergeSort(arr, l, m);
                mergeSort(arr, m + 1, r);


                merge(arr, l, m, r);
            }
        }

    }

        public static void main (String[] args)
    {
        System.out.println("THE MERGESORT WILL HAPPEN USING DIVIDE AND CONQUER RULE, REST OF THE CODE IS FROM LAST DAY");
        System.out.println("enter the first array:");
        Scanner sc= new Scanner(System.in);
        int[] inp1= new int[5];
        for(int i=0;i<4;i++){
            inp1[i]=sc.nextInt();
        }
        bubbleSort(inp1);
        System.out.println("after sorting 1st array: ");
        for (int i=1; i<inp1.length; i++){
            System.out.println(inp1[i]);
        }
        System.out.println("enter the second array");
        int[] inp2= new int[5];
        for(int i=0;i<4;i++){
            inp2[i]=sc.nextInt();
        }
        bubbleSort(inp2);
        System.out.println("after sorting 2nd array: ");
        for (int i=1; i<inp2.length; i++){
            System.out.println(inp2[i]);
        }
        int[] res= mergeArray(inp1, inp2);
        System.out.println("after merging:");
        MergeSort ob = new MergeSort();
        ob.mergeSort(res, 0, res.length - 1);
        printArray(res);
    }
}