package com.company;

public class string {

    public static void main(String args[])
    {
        String s = "Sibendu";
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        for (char c : arr) {
            System.out.print(c+ " ");
        }
        System.out.println();
        System.out.println(s);
    }
}