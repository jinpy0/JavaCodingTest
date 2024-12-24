package com.java.silver3;
// 달팽이

//문제
//홀수인 자연수 N이 주어지면, 다음과 같이 1부터 N2까지의 자연수를 달팽이 모양으로 N×N의 표에 채울 수 있다.
//9  2	3
//8	 1	4
//7	 6	5

//25 10	11 12 13
//24 9	2  3  14
//23 8	1  4  15
//22 7	6  5  16
//21 20	19 18 17

//N이 주어졌을 때, 이러한 표를 출력하는 프로그램을 작성하시오.
//또한 N2 이하의 자연수가 하나 주어졌을 때, 그 좌표도 함께 출력하시오. 예를 들어 N=5인 경우 6의 좌표는 (4,3)이다.

//입력
//첫째 줄에 홀수인 자연수 N(3 ≤ N ≤ 999)이 주어진다. 둘째 줄에는 위치를 찾고자 하는 N2 이하의 자연수가 하나 주어진다.

import java.util.Scanner;

public class Solved1913 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();

        int[][] map = new int[n][n];
        int value = 1;

        // 시작 좌표
        int x = n / 2, y = n / 2;

        int limit = 1;
        while (true) {
            for (int i = 0; i < limit; i++) {
                map[y--][x] = value++;
            }

            if (value - 1 == n * n) break;

            for (int i = 0; i < limit; i++) {
                map[y][x++] = value++;
            }
            limit++;

            for (int i = 0; i < limit; i++) {
                map[y++][x] = value++;
            }

            for (int i = 0; i < limit; i++) {
                map[y][x--] = value++;
            }
            limit++;
        }

        int tx = 0, ty = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (t == map[i][j]) {
                    ty = i + 1;
                    tx = j + 1;
                }
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(ty + " " + tx);
    }
}