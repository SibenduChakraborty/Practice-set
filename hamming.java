package com.company;
import java.util.Arrays;
public class hamming {
    static int hd(int[] arr1, int[] arr2){
        int error = 0;
        for(int i= 0; i< arr1.length; i++){
            if((arr1[i] ^ arr2[i]) == 1){
                error++;
            }
        }
        return error;
    }
    public static void main(String[] args) {
        int[][] dest1= {{1,0,1,1},{1,0,1,0},{1,0,0,1},{0,1,1,1}};
        int[] hc= {0,1,0,1};
        int[] res= new int[4];
        for(int i=0; i<=3;i++){
            res[i] = hd(hc,dest1[i]);
        }
        int[] restemp= new int[4];
        int c=0;
        for(int i: res){
            restemp[c]= i;
            c++;
        }
        Arrays.sort(restemp);
        for(int j=0; j<4; j++){
            if(res[j]==restemp[0]){
                System.out.println("the minimum distance is : " + restemp[0] +
                        " , the codeword is : "+ Arrays.toString(dest1[j]) +
                        " , destination index : " + (j+1));
            }
        }
    }
}
