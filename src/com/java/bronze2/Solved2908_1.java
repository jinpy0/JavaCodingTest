package com.java.bronze2;

import java.util.Scanner;

public class Solved2908_1 {
    static String change(String i){
        String changeNum = ""+ i.charAt(2) + i.charAt(1) + i.charAt(0);
        return changeNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");

        int a = Integer.parseInt(change(input[0]));
        int b = Integer.parseInt(change(input[1]));

        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
