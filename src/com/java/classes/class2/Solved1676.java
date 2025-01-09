package com.java.classes.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Solved1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        BigInteger result = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            result.multiply(BigInteger.valueOf(i));
        }

        String num = result.toString();

        int count = 0;
        for (int i = num.length()-1; i >= 0; i--) {

            if (num.charAt(i) != '0') {
                break;
            }

            if (num.charAt(i) == '0') {
                count++;
            }
        }
        System.out.println(count);
    }

}
