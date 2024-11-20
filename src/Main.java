import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 100 이상, 20억 이하
        int f = sc.nextInt(); // 100 이하

        int n1 = (n / 100) * 100; // n을 f로 나눈 값의 100의 자리수 이상
//        int n2 = n % 100; // 비교해야 할 값? 00 부터 시작하면 될 듯

        int rest = 0;
        for (int i = 0; i < 100; i++) {
            if((n1 + i) % f == 0){
                rest = i;
                break;
            }
        }

        System.out.printf("%02d\n", rest);

        sc.close();
    }
}