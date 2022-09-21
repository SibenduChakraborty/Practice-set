package com.company;
//SIBENDU SAKHAR CHAKRABORTY
//191001001076
//*************************************************************************
class Parent{
    int id;
    String name;
    String address;
    void set(String name,String address,int id){
        this.name= name;
        this.address= address;
        this.id=id;
    }
    void show(){
        System.out.println("ID: " +id);
        System.out.println("name: "+ name);
        System.out.println("address: " + address);
    }
}
class childone extends Parent{
    int id;
    String name;
    String address;
    int marks;
    void set(String name,String address,int id,int marks){
        this.name= name;
        this.address= address;
        this.id=id;
        this.marks= marks;
    }
    void show(){
        System.out.println("ID: " +id);
        System.out.println("name: "+ name);
        System.out.println("address: " + address);
        System.out.println("marks: " + marks);
    }
}
class chiltwo extends Parent{
    int id=4;
    String name="suman";
    String address="barrackpore";
    int marks;
    String qualification;
    int salary;
    void set(String name,String address,int id,int marks,String qualification,int salary){
        this.name= name;
        this.address= address;
        this.id=id;
        this.marks= marks;
        this.qualification= qualification;
        this.salary=salary;
    }
    void show(){
        System.out.println("ID: " +id);
        System.out.println("name: "+ name);
        System.out.println("address: " + address);
        System.out.println("marks: " + marks);
        System.out.println("qualification: "+ qualification);
        System.out.println("salary: " + salary);
    }

}
public class OOPlabASS5day6 {
    public static void main(String[] args) {
        Parent p= new Parent();
        childone c1= new childone();
        chiltwo c2= new chiltwo();
        p.set("Siddharth","Barrackpore",99);
        c1.set("Samar","Barrackpore",100,95);
        c2.set("suman" ,"barrackpore",101,96,"CEO",100000);
        p.show();
        c1.show();
        c2.show();
    }
}
