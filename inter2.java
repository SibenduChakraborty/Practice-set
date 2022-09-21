package com.company;
//Create two interfaces, each with two methods. Inherit a new interface from the two,
//adding a new method. Create a class by implementing the new interface and also
//inheriting from a concrete class. In main() method, create an object of derived class
//and call the methods [do all without package statement].
interface one{
    default void a(){
        System.out.println("this is a");
    };
    default void b(){
        System.out.println("this is b");
    };
}
interface two{
    default void c(){
        System.out.println("this is c");
    };
    default void d(){
        System.out.println("this is d");
    };
}
interface three extends one, two{
    default void e(){
        System.out.println("this is e");
    };
    default void f(){
        System.out.println("this is f");
    };
}
class test_1{};
class test_2 extends test_1 implements three {

}
public class inter2 {
    public static void main(String[] args) {
        test_2 t2= new test_2();
        t2.a();
        t2.b();
        t2.c();
        t2.d();
        t2.e();
        t2.f();
    }
}
