package com.company;
import java.util.Scanner;
class employee{
   String n;
   int i;
    void set(String name, int id){
       this.n=name;
        this.i=id;
    }
    void get(){
        System.out.println("hi i am " + n);
        System.out.println("my id is " + i);
    }
}
public class j4class {
    public static void main(String[] args) {
      //  Scanner sc= new Scanner(System.in);
        employee sibendu= new employee();
       sibendu.set("sibendu", 10);
       sibendu.get();
       employee subham= new employee();
       subham.set("subham", 11);
       subham.get();
    }
}
