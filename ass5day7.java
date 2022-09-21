package com.company;
//191001001076
//Sibendu Sakhar Chakraborty
class show1{
    void show(){
        System.out.println("show 1");
    }
}
class show2{
    void show(){
        System.out.println("show 2");
    }
}
class show3{
    void show(){
        System.out.println("show 3");
    }
}
public class ass5day7 {
    public static void main(String[] args) {
        show1 s1= new show1();
        show2 s2= new show2();
        show3 s3= new show3();
        s1.show();
        s2.show();
        s3.show();
    }
}
