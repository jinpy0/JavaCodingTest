import java.math.BigInteger;
import java.util.Scanner;

public class Main {
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
                System.out.println("+");
            } else {
                System.out.println("-");
            }
        }
    }
}
