package com.company;
import java.util.*;
public class substring {
    static void substring(String s, String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        String ros= s.substring(1);
        char ch= s.charAt(0);
        substring(ros,ans);
        substring(ros,ch+ans);
    }
    public static void main(String[] args) {
        substring("abc","");
    }
}
