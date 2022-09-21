package com.company;
class test2{
    double res;
    void add() {  }
    float add(int a,float b) { return a+b;}
    void add(String a, String b) {
        System.out.println(a+b);
    }

}
public class ooplabday2add {
    public static void main(String[] args) {
        test2 test= new test2();
        test.add();
        System.out.println(test.add(2, (float) 3.14));
        test.add("a","b");
    }
}
