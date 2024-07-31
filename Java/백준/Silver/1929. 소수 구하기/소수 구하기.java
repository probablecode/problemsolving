import java.util.*;
public class Main {
    public static TreeSet<Integer> primes = new TreeSet<>(List.of(2, 3, 5, 7));
    public static int max = 7;
    public static void PrimeNumber(int number) throws Exception {
        if (number == 1) return;
        int limit = (int)Math.sqrt((double) number);
        for (int prime : primes) {
            if (limit < prime) {
                primes.add(number);
                return;
            }
            if (number % prime == 0)
                return;
        }
        throw new Exception(String.format("weird, the number : %d\n primes : " + primes,  number));
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int from = sc.nextInt();
        int to = sc.nextInt();
        do {
            max += 2;
            PrimeNumber(max);
        } while (max < to);
        for (int prime : primes.subSet(from, true, to, true))
            System.out.println(prime);
    }
}
