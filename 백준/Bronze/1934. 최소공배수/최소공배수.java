import java.util.Scanner;
public class Main {
    
    public static int GCD(int A, int B) {
        int big = Math.max(A, B);
        int small = Math.min(A, B);
        while (0 < small) {
            int temp = small;
            small = big % small;
            big = temp;
        }
        return big;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println( (A / GCD(A, B)) * B);
        }
    }
}