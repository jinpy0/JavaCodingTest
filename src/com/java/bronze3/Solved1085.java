package com.java.bronze3;

// 문제
// 한수는 지금 (x, y)에 있다.
// 직사각형은 각 변이 좌표축에 평행하고, 왼쪽 아래 꼭짓점은 (0, 0), 오른쪽 위 꼭짓점은 (w, h)에 있다.
// 직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.

// 입력 : 첫째 줄에 x, y, w, h가 주어진다.

// 출력 : 첫째 줄에 문제의 정답을 출력한다.

import java.util.Scanner;

public class Solved1085 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int w = s.nextInt();
        int h = s.nextInt();
    
        // int x 와 0 또는 w 와의 거리 중 짧은 거리 -> w/2 와 x를 비교했을 때 x가 크면 w와 가깝고 아닐 경우 0과 가까움
        // int y 와 0 또는 h 와의 거리 중 짧은 거리
        // 두 개를 비교
        int resultX;
        int resultY;
//        if(x < w/2){
        if(x < w-x){
            resultX = x;
        }else {
            resultX = w-x;
        }
//        if(y < h/2){
        if (y < h-y){
            resultY = y;
        }else {
            resultY = h-y;
        }

        if(resultY > resultX){
            System.out.println(resultX);
        }
        else {
            System.out.println(resultY);
        }


        

    }
}
