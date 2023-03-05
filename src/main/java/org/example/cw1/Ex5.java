//Дан массив nums. runningSum[i]=sum(nums[0]...nums[i])
package org.example.cw1;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int[] array=new int[n];
        for (int i = 0; i < n; i++) {
            array[i]=sc.nextInt();
        }
        int [] res=new int[n];
        res[0]=array[0];
        for (int i = 1; i < array.length; i++) {
            res[i]=res[i-1]+array[i];
        }
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);

        }
    }
}
