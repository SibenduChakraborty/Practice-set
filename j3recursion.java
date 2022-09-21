package com.company;
public class j3recursion {
    static int factorial(int n){
        if(n==0){
            return 0;
        }
       else if (n==1){
           return 1;
       }
        else{
           return (factorial(n-1)+factorial(n-2));
        }
    }
    public static void main(String[] args) {
        System.out.println(factorial(0));
        System.out.println(factorial(1));
        System.out.println(factorial(2));
        System.out.println(factorial(3));
        System.out.println(factorial(4));
    }
}