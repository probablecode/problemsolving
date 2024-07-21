import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int big = Math.max(A,B);
        int small = Math.min(A, B);
        while (small != 0) {
            int tmp = big % small;
            big = small;
            small = tmp;
        }
        System.out.println(big);
        System.out.println(A * B / big);
    }
}
