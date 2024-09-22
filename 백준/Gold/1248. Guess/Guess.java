import java.util.Scanner;

public class Main {
    public static final int LEN = 21;
    public static int[][] s;

    public static boolean done = false;
    public static int n;
    public static boolean[] check = new boolean[LEN];
    public static int[] nums;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
        s = new int[n][n];
        nums = new int[n];
        int idx = 0;
        String[] split = sc.nextLine().split("");
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                String str = split[idx++];
                s[i][j] = str.equals("+") ? 1 : str.equals("-") ? -1 : 0;
            }
        }
//        for (int i =0; i < n; i++)
//        {
//            for(int j = 0; j < n; j++)
//                System.out.printf("%d\t", s[i][j]);
//            System.out.println();
//        }

        go(0);
        String str = String.valueOf(nums[0]);
        for (int i = 1; i < n; i++)
            str += String.format(" %d", nums[i]);
        System.out.println(str);

    }

    private static void go(int cnt) {
//        System.out.printf("Guess.go(%d)\n", cnt);
        if (done) return;
        if (cnt == n){
            done = true;
            return;
        }

        if (s[cnt][cnt] == -1) {
            for (int i = -10; i < 0; i++) {
                int cIdx = i + 10;

//                if (check[cIdx])
//                    continue;
                if (!validation(cnt, i)) {
//                    System.out.printf("(%d, %d)\n", cnt, i);
                    continue;
                }
                if (done) return;

                nums[cnt] = i;
//                check[cIdx] = true;
                go(cnt + 1);
//                check[cIdx] = false;
            }
        }
        else if (s[cnt][cnt] == 1) {
            for (int i = 1; i < 11; i++) {
                int cIdx = i + 10;
//                if (check[cIdx])
//                    continue;
                if (!validation(cnt, i))
                    continue;
                if (done) return;

                nums[cnt] = i;
//                check[cIdx] = true;
                go(cnt + 1);
//                check[cIdx] = false;
            }
        }
        else {
//            if (check[10])
//                return;
            if (!validation(cnt, 0))
                return;
            if (done) return;
            nums[cnt] = 0;
//            check[10] = true;
            go(cnt + 1);
//            check[10] = false;
        }
    }

    private static boolean validation(int cnt, int num) {
//        System.out.printf("Guess.validation start(%d, %d)\n", cnt, num);
        int sum = num;
        for (int i = cnt - 1; -1 < i; i--) {
            sum += nums[i];
            int sign = s[i][cnt];
            if (sum < 0 && sign != -1)
                return false;
            else if (0 < sum && sign != 1)
                return false;
            else if (sum == 0 && sign != 0)
                return false;
        }
//        System.out.printf("Guess.validation end with true(%d, %d)\n", cnt, num);
        return true;
    }

}
