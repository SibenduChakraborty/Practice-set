package com.company;
class student{
    int roll;
    String name;
    String stream;
    String college;
    student(int a, String n, String s, String c){
      roll=a;
      name=n;
      stream=s;
      college= c;
    }
    void set(){
        System.out.println("name :"+name);
        System.out.println("roll:" +roll);
        System.out.println("stream: " + stream);
        System.out.println("college: " +college);
    }
}
public class ooplabday2student {
    public static void main(String[] args) {
        student[] group = new student[5];
        group[0]= new student(2,"someone","ece","TIU");
        //group[0].set(1,"sibendu","cse","TIU");
        group[0].set();
        group[1]= new student(1,"sibendu","cse","TIU");
        group[1].set();
    }
}
