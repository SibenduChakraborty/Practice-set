package com.company;
import java.util.Scanner;
class account{
    String name;
    int accnum;
    int balance;
    String type;
    int due=0;
    public void set(String n, int acc, int bal){
        name=n;
        accnum= acc;
        balance=bal;
    }
    public void deposit(int m)
    {
        System.out.println("enter the amount: ");
        balance= balance+m-due;
    }
    public void update(){
        if(balance<1000){
            due=100;
        }
        else {
            due= 0;
        }
    }
    public void withdraw(int n)
    {
        System.out.println("enter the amount: ");
        balance= balance-n-due;
    }
    public void display()
    {
        System.out.println("you account number is "+ accnum + " and you balance is "+ balance );
    }

}
public class OOPlabASS4day5q1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your account name: ");
        String name= sc.nextLine();
        System.out.println("accout number: " );
        int accnum= sc.nextInt();
        System.out.println("balance: ");
        int balance= sc.nextInt();
        account acc= new account();
        acc.set(name,accnum,balance);


        // rest of the code will continue with the concept of inheritance


    }
}
