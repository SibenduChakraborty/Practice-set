package com.company;

class Employee{
    String name;
    int id;
    void set(String name, int id){
        this.name= name;
        this.id= id;
    }
    void display(){
        System.out.println("name: " + name);
        System.out.println("id: " + id);
    }
}
class sceintist extends Employee{
    String name;
    int id;
    int no_of_pub=60;
    String experience="PHD";
    void set(String name, int id){
        this.name= name;
        this.id= id;
    }
    void display(){
        System.out.println("name: " + name);
        System.out.println("id: " + id);
        System.out.println("no_of_pub: " + no_of_pub);
        System.out.println("experience: "+ experience);
    }
}
class dsceintist extends sceintist{
    String name;
    int id;
    void set(String name, int id){
        this.name= name;
        this.id= id;
    }
    String award="Best Scientist award";
    void display(){
        System.out.println("name: " + name);
        System.out.println("id: " + id);
        System.out.println("no_of_pub: " + no_of_pub);
        System.out.println("experience: "+ experience);
        System.out.println("award" + award);
    }
}
public class OOPlabASS5day6b {
    public static void main(String[] args) {
        Employee em= new Employee();
        Employee sc= new sceintist();
        Employee dsc= new dsceintist();
        em.set("employee",101);
        sc.set("scientist" , 102);
        dsc.set("d scientist" , 103);
        em.display();
        sc.display();
        dsc.display();
    }
}