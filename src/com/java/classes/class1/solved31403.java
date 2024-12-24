package com.java.classes.class1;

import java.util.Scanner;

public class solved31403 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int test1= a+b-c;
        String s = "";
        s+=a;
        s+=b;
        int test2 = Integer.parseInt(s)-c;

        System.out.println(test1);
        System.out.println(test2);
    }
}
