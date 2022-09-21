package com.company;
//Create an interface IntA having one method default public void f1(){....} and also
//create one interface IntB having method name as default public void f1(){....}
//- Implement both interfaces in a class
//In main() method, create an object of class and call the methods
interface IntA{
    default void f1(){};
}
interface IntB{
    default void f2(){};
}
class inteRface implements IntA,IntB{
    public void f1(){
        System.out.println("f1");
    }
    public void f2(){
        System.out.println("f2");
    }
}
public class inter4 {
    public static void main(String[] args) {
        inteRface in= new inteRface();
        in.f1();
        in.f2();
    }
}