package com.java.bronze2;
//문제
//지민이는 주사위 던지기 게임을 좋아하여 어느 날 옆에 있는 동호를 설득하여 주사위 던지기 게임을 하자고 하였다.
//총 3개의 주사위가 있다. 그리고 이 주사위는 각각 S1(2 ≤ S1 ≤ 20), S2(2 ≤ S2 ≤ 20), S3(2 ≤ S3 ≤ 40)개의 면이 있다.
//문제는 세 개의 주사위를 동시에 던졌을 때 가장 높은 빈도로 나오는 세 주사위의 합을 구하는 것이다.
//예를 들어, S1 = 3, S2 = 2, S3 = 3으로 주어질 때, 주사위1은 S1(3)개의 면이 있으므로 1, 2, 3의 눈을 가지고,
// 주사위2는 S2(2)개의 면이 있으므로 1, 2의 눈을 가지며, 주사위3은 S3(3)개의 면이 있으므로 1, 2, 3의 눈을 가진다.
// 이 때, 이 3개의 주사위를 던져서 눈의 합을 구하면,
// (1, 1, 1) = 3, (1, 1, 2) = 4, (1, 1, 3) = 5, ... , (3, 2, 1) = 6, (3, 2, 2) = 7, (3, 2, 3) = 8과 같은 합들을 얻을 수 있다.
// 이 때, 가장 많이 발생하는 합을 구하는 것이다.

//입력
//입력 파일의 첫째 줄에 정수 S1, S2, S3가 주어진다.

//출력
//출력 파일의 첫째 줄에 가장 높은 빈도로 나오는 세 주사위 합을 구하는 것이다. 단 답이 여러개라면 가장 합이 작은 것을 출력한다.
import java.util.Scanner;

public class Solved1233 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();

        int arr[][][] = new int[s1][s2][s3];

        for (int i = 1; i <= s1; i++) {
            for (int j = 1; j <= s2; j++) {
                for (int k = 1; k <= s3; k++) {
                    arr[i-1][j-2][k-3] = i+j+k;
                }
            }
        }

        for (int i = 0; i < s1; i++) {
            for (int j = 0; j < s2; j++) {
                for (int k = 0; k < s3; k++) {
                    System.out.println(arr[i][j][k]);
                }
            }
        }



    }
}
