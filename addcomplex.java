package com.company;
import java.util.Scanner;
public class addcomplex {
    static int add1(int a, int b){
        int res1= a+b;
        return res1;
    }
    static int add2(int a,int b){
        int res2= a+b;
        return res2;
    }
    public static void main(String[] args) {
        System.out.println("enter the first number:");
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        System.out.print(" + ");
        int a1= sc.nextInt();
        System.out.println("i");
        System.out.println("enter the second number:");
        int b=sc.nextInt();
        System.out.print(" + ");
        int b1= sc.nextInt();
        System.out.print("i");
        System.out.println("result: " + add1(a,b) + " + " + add2(a1,b1)+ "i");
    }

}
