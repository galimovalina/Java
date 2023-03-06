package org.example.hw1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        if (s.contains("   ")) {
            s = replaceSpace(s);
        }
        System.out.println(s.trim());
        String[] phrase=s.split(" ");
        String[] res = new String[phrase.length];
        for (int i = 0; i < phrase.length; i++) {
            res[i]=phrase[phrase.length-i-1];
        }
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }

    }
    public static String replaceSpace(String str){
        String s1=str.replace("   "," ");
        return s1;
    }
}
