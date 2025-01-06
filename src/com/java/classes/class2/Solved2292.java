package com.java.classes.class2;

import java.util.Scanner;

public class Solved2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 1번 방: 1번
        // 2~7번 방: 2번(6개)
        // 8~19번 방: 3번(12개)+6
        // 20~37번 방: 4번(18개)+6
        // 38~61번 방: 5번(24개)+6 ....

        if (n == 1) {
            System.out.println(1);
        } else if (n >= 2 && n <= 7) {
            System.out.println(2);
        } else {
            int startNum = 8;
            int endNum = 19;
            int count = 3;
            while (true) {
                // n이 1번일 때
                // n이 2~7번일 때 (+1, +6)
                // n이 8~19번일 때 (+6, +12)
                // n이 20~37번일 때 (+12, +18)
                // n이 38~61번일 때
                if(n>=startNum && n<=endNum) {
                    System.out.println(count);
                    break;
                }
                else{
                    count++;
                    startNum = endNum+1;
                    endNum = endNum+ 6*(count-1);
                }

            }
        }

    }

}

