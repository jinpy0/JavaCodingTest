package com.java.classes.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solved1463_4 {
    public static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n + 1]; // n까지 계산해야 하므로 n+1 크기로 설정

        System.out.println(count(n));
    }

    public static int count(int n) {
        arr[1] = 0;  // 1은 연산이 필요 없으므로 0으로 초기화

        // 한번 계산한 값은 배열에 채워져 있어서 가져다 쓸 수 있음
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + 1;
            // Ex) i == 6 -> arr[6] 의 값을 arr[5]+1 으로 초기화

            if (i % 2 == 0) {
                arr[i] = Math.min(arr[i], arr[i / 2] + 1);
                // Ex) i == 6 -> arr[6], arr[3] + 1 중 더 작은 수를 arr[6] 에 저장
            }

            if (i % 3 == 0) {
                arr[i] = Math.min(arr[i], arr[i / 3] + 1);
                // Ex) i == 6 -> arr[6], arr[2]+1 중 더 작은 수를 arr[6]에 저장
                // 이 때, arr[6]에는 arr[i-1]+1 과 arr[i/2]+1 중 작은 수가 저장되어 있음
            }
        }

        return arr[n];
    }
}
