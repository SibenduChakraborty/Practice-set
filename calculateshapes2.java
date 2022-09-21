package com.company;
import java.util.Scanner;
public class calculateshapes2 {
    int square(int a){
        return a*a;
    }
    int rectangle(int a,int b){
        return a*b;
    }
    double circle(double x){
        return 3.14 * x * x;
    }
    public static void main(String[] args) {
        calculateshapes2 obj= new calculateshapes2();
        System.out.println("choose the shape:\n" +
                "1-->square \n" +
                "2-->rectangle\n" +
                "3-->circle\n");
        Scanner sc= new Scanner(System.in);
        int option= sc.nextInt();
        if(option==1){
            System.out.println("enter the side:");
            int A= sc.nextInt();
            System.out.println("the area of the square is " + obj.square(A));
        }
        else if(option ==2){
            System.out.println("enter the sides:");
            int B1= sc.nextInt();
            int B2=sc.nextInt();
            System.out.println(" the area of the rectangle is " +obj.rectangle(B1,B2));
        }
        else if(option ==3){
            System.out.println("enter the radius:");
            double r= sc.nextDouble();
            System.out.println("the area of the circle is " + obj.circle(r));
        }
    }
}
