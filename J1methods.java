package com.company;
import java.util.Scanner;
public class J1methods {
     int mult(int a,int b){
        int c=a*b;
        return c;
    }
    public static void main(String[] args) {
        int a= 5;
        int b= 6;
        J1methods obj= new J1methods();
        obj.mult (a,b);
        System.out.println(obj.mult (60,21));
    }
}
