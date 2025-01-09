package com.java.classes.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solved7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Person[] persons = new Person[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            persons[i] = new Person(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = 1;
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                if (persons[i].x <= persons[j].x && persons[i].y <= persons[j].y) {
                    arr[i]++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static class Person {
        int x;
        int y;

        public Person(int x, int y) {
            this.x = x;
            this.y = y;
        }


    }
}
