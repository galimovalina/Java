package org.example.seminar4.hw2;

import java.util.LinkedList;
import java.util.Stack;

public class Ex2 {
    public static void main(String[] args) {
        String s="(]";
        System.out.println(isValid(s));

    }
    public static boolean isValid(String s){
    LinkedList<Character> somelist=new LinkedList<>();
    for(char i: s.toCharArray()) {
        if(i=='(')
            somelist.add(')');
        else if (i=='{')
            somelist.add('}');
        else if (i=='[')
            somelist.add(']');
        else if (somelist.isEmpty() || somelist.poll() !=i)
            return false;
    }
        return true;
    }
}
