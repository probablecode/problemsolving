import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int digit = 1, count = 1;
        int answer = 0;
        while (true) {
            int next = digit * 10;
            if (N < next)
            {
               answer += (N - digit + 1) * count;
               break;
            }
            answer += (next - digit) * count;
            digit = next;
            count++;
        }
        System.out.println(answer);
        
    }
}