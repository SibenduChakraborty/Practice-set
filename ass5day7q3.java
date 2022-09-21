package com.company;
abstract class base1{
    abstract void method1();
    abstract void method2();
}
 class base2 extends base1{
     void method1(){
         System.out.println("method 1 from derived");
     };
     void method2(){
         System.out.println("method 2 from derived");
     }
}
public class ass5day7q3 {
    public static void main(String[] args) {
        base1 ob= new base2();
        ob.method1();
        ob.method2();
    }
}
