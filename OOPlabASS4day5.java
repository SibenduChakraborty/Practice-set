package com.company;
class test3{
    test3(){
        System.out.println("this is constructor of test 3");
    }
    static{
        System.out.println("this is static of test3");
    }
    {
        System.out.println("this is instance of test 3");
    }
}
class test4 extends test3{

    test4(){
        System.out.println("this is constructor of test 4");
    }
    static{
        System.out.println("this is static of test 4");
    }
    {
        System.out.println("this is instance of test 4");
    }
    static{
        System.out.println("this is second static in test4");
    }
}
public class OOPlabASS4day5 {
    public static void main(String[] args) {
        test3 tst3= new test3();
        test4 tst4= new test4();
    }
}
