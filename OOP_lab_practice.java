package com.company;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;
//a) Write a JAVA Program to make a Student class with proper attributes
//like roll no, name, stream, and college. From main create such two
//students and show their information.
class student1{
    int roll;
    String name;
    String stream;
    String college;
    String nos;

    void setdata(int p,String n, String m, String o){
        roll= p;
        name= n;
        stream=m;
        college = o;
    }
    void getdata(){
        System.out.println("Data: ");
        System.out.println("roll: "+ roll);
        System.out.println("name: " + name);
        System.out.println("stream: " + stream);
        System.out.println("college: " + college);
        System.out.println();
    }
    //****************************** below is the method for taking subjects based on the variable <nos> from main ***********************
    static void Subject(String ...arr){
       // Subject v;
        for(String s: arr){
            System.out.println("subject: " + s);
        }
    }
}
//***********************   below is the different class for subject, but that way i am not able to take input properly***********************
//class Subject{
//    static void Subject(String ...arr){
//        Subject v;
//        for(String s: arr){
//            System.out.println("subject: " + s);
//        }
//    }
//}
public class OOP_lab_practice {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
      System.out.println("enter the number of students: ");
      int num= sc.nextInt();
      student1 s1[]= new student1[num];
      for(int i= 0; i<num; i++) {
          s1[i]= new student1();
          System.out.println("enter roll: ");
          int n = sc.nextInt();
          System.out.println("enter name: ");
          sc.nextLine();
          String o = sc.nextLine();
          System.out.println("enter stream: ");
          String p = sc.nextLine();
          System.out.println("enter college: ");
          String q = sc.nextLine();
          s1[i].setdata(n, o, p, q);
          System.out.println("enter the number of Subjects :");
          int nos= sc.nextInt();//***************************************************** VARIABLE NUMBER OF SUBJECTS , <nos>
          String[] subjectarray= new String[nos];
          for(int j=0;j<nos;j++) {
              String sub= sc.nextLine();
              subjectarray[j]= sub;
          }
          s1[i].Subject(subjectarray);
      }
      for(int i=0; i<num; i++){
          s1[i].getdata();
      }

       //Subject sb= new Subject();
       //sb.Subject("math" , "physics", "biology");

    }
}
