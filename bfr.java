package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bfr {
    public static void main(String[] args) throws IOException {
        BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
        int T= Integer.parseInt(inp.readLine()); // for taking a number as an input
        String str = inp.readLine(); // for taking a string as an input
        System.out.println(T);
        System.out.println(str);
    }
}
