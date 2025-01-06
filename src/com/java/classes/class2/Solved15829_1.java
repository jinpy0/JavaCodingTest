package com.java.classes.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solved15829_1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long l = Long.parseLong(br.readLine());
        String st = br.readLine();
        long result = 0;
        long pow = 1;
        for (int i = 0; i < l; i++) {
            result += (st.charAt(i) - 96) * pow;
            pow = pow * 31 % 1234567891;
        }
        System.out.println(result % 1234567891);
    }
}
