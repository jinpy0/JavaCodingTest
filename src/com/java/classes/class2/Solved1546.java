package com.java.classes.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solved1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        double[] scores = new double[n];
        double max = 0;
        for (int i = 0; i < n; i++) {
            scores[i] = Double.parseDouble(st.nextToken());
            if (scores[i] > max) {
                max = scores[i];
            }
        }

        double result = 0;
        for (int i = 0; i < n; i++) {
            result += (scores[i] /max) *100;
//            System.out.println(result);
        }

        System.out.println(result / n);
    }
}
