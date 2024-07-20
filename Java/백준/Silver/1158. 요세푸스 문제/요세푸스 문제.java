import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    private static Queue<Integer> queue = new LinkedList<>();
    private static int K = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for (int i = 1; i <= N; i++)
            queue.add(i);
        K = sc.nextInt();
        StringBuffer sb = new StringBuffer(N * 3);
        sb.append(String.format("<%d", nextPoll()));
        for (int i = 1; i < N; i++) {
            sb.append(String.format(", %d", nextPoll()));
        }
        sb.append(">");
        System.out.println(sb.toString());
    }

    private static Integer nextPoll() {
        for (int i = 1; i < K; i++) {
            queue.add(queue.poll());
        }
        return queue.poll();
    }
}
