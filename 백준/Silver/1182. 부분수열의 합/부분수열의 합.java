import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] nums = new int[N];
        int S = sc.nextInt();
        int answer = 0;
        for (int i = 0; i < N; i++)
            nums[i] = sc.nextInt();
        for (int i = 1; i < (1 << N); i++) {
            int sum = 0;
            for (int j = 0; j < N; j++) {
                int check = 1 << j;
                if ((i & check) == check)
                    sum += nums[j];
            }
            if (sum == S)
                answer++;
        }
        System.out.println(answer);
    }
}