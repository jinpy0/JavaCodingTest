package com.java.bronze3;

//문제
//N개의 정수가 주어지면, 이 정수들의 합 S의 부호를 구하는 프로그램을 작성하시오.
//
//입력
//총 3개의 테스트 셋이 주어진다. 각 테스트 셋의 첫째 줄에는 N(1 ≤ N ≤ 100,000)이 주어지고, 둘째 줄부터 N개의 줄에 걸쳐 각 정수가 주어진다.
//주어지는 정수의 절댓값은 9223372036854775807보다 작거나 같다.
//
//출력
//총 3개의 줄에 걸쳐 각 테스트 셋에 대해 N개의 정수들의 합 S의 부호를 출력한다.
//S=0이면 "0"을, S>0이면 "+"를, S<0이면 "-"를 출력하면 된다.


import java.math.BigInteger;
import java.util.Scanner;

public class Solved1247 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int n = s.nextInt();
//            long sum = 0;
            BigInteger sum = BigInteger.ZERO;
            for (int j = 0; j < n; j++) {
//                sum += s.nextLong();
                BigInteger num = s.nextBigInteger();
                sum = sum.add(num);
            }

//            if (sum == 0) {
            if(sum.equals(BigInteger.ZERO)) {
                System.out.println("0");
//            } else if (sum > 0) {
            } else if (sum.compareTo(BigInteger.ZERO) > 0) {
//            } else if (sum.compareTo(BigInteger.ZERO) == 1) {
                // compareTo(BigInteger.ZERO)) -> 0과 sum 을 비교해 sum이 큰 값일 경우 1을 반환, 아닐 경우 -1을 반환
                System.out.println("+");
            } else {
                System.out.println("-");
            }
        }
    }
}
