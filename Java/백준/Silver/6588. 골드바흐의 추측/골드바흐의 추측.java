import java.io.*;
import java.util.*;

public class Main {
    
    public static int max = 1000000;
    public static boolean[] number = new boolean[max + 1];
    public static int[] primes = new int[max + 1];
    public static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        number[0] = true; number[1] = true;

        for (int i = 2; i * i <= max; i++) {
            if (!number[i]) {
                for (int j = i * i; j <= max; j += i)
                    number[j] = true;
            }
        }
        primes[count++] = 3;
        primes[count++] = 5;
        List<Integer> primeList = new ArrayList<>(List.of(3, 5));
        int check = 7;
        while (check < 999994) {
            if (!number[check])
                primes[count++] = check;
            check += 4;
            if (!number[check])
                primes[count++] = check;
            check += 2;
        }
        if (check < max && !number[check])
           primes[count++] = check;
        check += 4;
        if (check < max && !number[check])
           primes[count++] = check;
        
        while (true) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) break;
            boolean wrong = true;
            for (int prime : primes) {
                if (!number[num - prime]) {
                    bw.write(String.format("%d = %d + %d\n", num, prime, num - prime));
                    wrong = false;
                    break;
                }
            }
            if (wrong)
                System.out.println("Goldbach's conjecture is wrong.");
        }
        br.close();
        bw.close();
    }
}
