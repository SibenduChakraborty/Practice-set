package com.company;
import java.util.Scanner;
class q1{
    public q1(){
        System.out.println("Q1) Sibendu Sakhar Chakraborty");
    }
}
class q2{
   double converter(double f){
        return ((f-32)/1.8);
    }
}
class q3{
    double gp(int n){
       double res=0;
        for (float i=1; i<=n;i++){
            res=res+(1/i);
        }
        return res;
    }
}
public class assignment191001001076 {

    public static void main(String[] args) {
        //**********************************************************
        Scanner sc= new Scanner(System.in);
        q1 obj1= new q1();
        //**********************************************************
        System.out.println("enter Fahrenheit value:");
        double f= sc.nextDouble();
        q2 conv= new q2();
        System.out.println(conv.converter(f));
        //**********************************************************
        System.out.println("enter the value:");
        int n=sc.nextInt();
        q3 Q3= new q3();
        double result = (Q3.gp(n));
        System.out.println(result);
    }
}
