package com.java.classes.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solved2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int num = solved(a, b);
        System.out.println(num);
        System.out.println(a*b/num);
    }

    static int solved(int a, int b) {
        if(a%b ==0)
            return b;
        return solved(b, a%b);
    }
}
