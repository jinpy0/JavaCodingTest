package com.java.classes.class1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class solved1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        System.out.print(st.countTokens());
    }
}
