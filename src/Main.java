import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        BigInteger result = BigInteger.valueOf(1);
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        char[] arr = result.toString().toCharArray();

        int count = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] == '0') {
                count++;
            }
            else{
                break;
            }
        }
        System.out.println(count);
    }

}