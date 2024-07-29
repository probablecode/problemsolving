import java.util.*;

public class Main {
    public static int min = 0;
    public static int N = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.nextLine());
        int M = Integer.parseInt(sc.nextLine());
        Set<Integer> iSet = new HashSet<>();
        for (int i = 0; i < M; i++) {
            iSet.add(sc.nextInt());
        }
        min = Math.abs(N - 100);
        for (int i = 0; i < 1000000; i++) {
            boolean pass = false;
            int num = i;
            int digit = 0;
            while (true) {
                digit++;
                if (iSet.contains(num % 10)) {
                    pass = true;
                    break;
                }
                num /= 10;
                if (num == 0)
                    break;
            }
            if (pass)
                continue;
            min = Math.min(min, digit + Math.abs(N - i));
        }
        System.out.println(min);
    }
}
