import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long right = cal(N);
        if (right < K) {
            System.out.println(-1);
            return;
        }
        long left = 1L;
        long val = 0;
// 이분 탐색
        while (left <= right) {
            long mid = (right + left) / 2;
            long len = cal(mid);
            if (len < K) {
                left = mid + 1;
            } else {
                val = mid;
                right = mid - 1;
            }
        }
        String s = String.valueOf(val);
        long l = cal(val);
        System.out.println(s.charAt(s.length() - (int)(l - K) - 1));
    }

    public static long cal (long n) {
        long ret = 0;
        long i = 1;
        long unitLen = 1;

        while (true) {
            long next = i * 10L;
            if (n < next) {
                ret += (n - i + 1L) * unitLen;
                break;
            }
            ret += ((next - i) * unitLen);
            i = next;
            unitLen++;
        }
        return ret;
    }

}