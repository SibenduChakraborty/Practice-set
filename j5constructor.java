package com.company;
class xyz{
    xyz(){
        System.out.println("this is a constructor");
    }
    xyz(int a){
        System.out.println("this is an overloaded constructor with the value of a as " +a);
    }
    xyz(int a , int b){
        System.out.println("this is another overloaded constructor with two values");
    }
}
class xyz2 extends xyz{
    xyz2(){
        super(2,3);
        System.out.println("this is a derived class constructor");
    }
    xyz2(int a){
        super(a);
        System.out.println("this is an overloaded constructor of derived class");
    }
}
public class j5constructor {
    public static void main(String[] args) {
        xyz2 xy2= new xyz2(5);
    }
}
