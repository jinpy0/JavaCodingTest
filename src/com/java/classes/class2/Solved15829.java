package com.java.classes.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solved15829 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        String st = br.readLine();
        int result = 0;
        for (int i = 0; i < l; i++) {
            int a = st.charAt(i) - 96;
            result += a * Math.pow(31, i);
        }
        System.out.println(result);
    }
}
