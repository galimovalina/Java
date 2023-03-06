
package org.example.hw2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int k=0;
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        while (a!=0){
            int b=sc.nextInt();
            if(a>0 && b<0){
                k+=a;
            }
            a=b;
        }
        System.out.println(k);

    }
}
