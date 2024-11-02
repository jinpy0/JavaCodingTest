//문제
//재원이는 서쪽의 사이트와 동쪽의 사이트를 다리로 연결하려고 한다.
//(이때 한 사이트에는 최대 한 개의 다리만 연결될 수 있다.)
//재원이는 다리를 최대한 많이 지으려고 하기 때문에 서쪽의 사이트 개수만큼 (N개) 다리를 지으려고 한다.
//다리끼리는 서로 겹쳐질 수 없다고 할 때 다리를 지을 수 있는 경우의 수를 구하는 프로그램을 작성하라.
//
//입력
//입력의 첫 줄에는 테스트 케이스의 개수 T가 주어진다.
//그 다음 줄부터 각각의 테스트케이스에 대해 강의 서쪽과 동쪽에 있는 사이트의 개수 정수 N, M (0 < N ≤ M < 30)이 주어진다.
//
//출력
//각 테스트 케이스에 대해 주어진 조건하에 다리를 지을 수 있는 경우의 수를 출력한다.

package com.java.silver5;

import java.io.*;

public class Solved1010 {
    static int[][] arr = new int[30][30];

    static int bridge(int a, int b) {
        if (arr[a][b] > 0) {
            return arr[a][b];
        }

        if (b == 0 || a == b) {
            return arr[a][b] = 1;
        }

        return arr[a][b] = bridge(a - 1, b - 1) + bridge(a - 1, b);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String line = br.readLine();
            String[] str = line.split(" ");
            int M = Integer.parseInt(str[0]);
            int N = Integer.parseInt(str[1]);
            int result = bridge(N, M);
            bw.write(result + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
