import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int result = 1;
            for (int j = 0; j < b; j++) {
                result *= a;
                result %= 10;
            }
            if (result == 0) {
                result = 10;
            }
            System.out.println(result);

            // 마지막 왜 출력 안됨? (엔터 눌러야 출력됨)
        }
        System.out.flush();
        sc.close();

    }
}
