package com.company;
public class j2varargs {
    static int sum(int ...arr){
        // stored as int[] arr
        int res=0;
        for(int a:arr){
            res+=a;// res= res+a;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4,5,6,7,8,9,10));
    }
}
