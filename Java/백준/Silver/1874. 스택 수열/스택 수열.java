import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    private static Stack<Integer> stack = new Stack<>();
    private static int node = 0;
    private static StringBuffer sb;

    public static void sPush() {
        stack.push(++node);
        sb.append("+\n");
    }
    public static void sPop() {
        stack.pop();
        sb.append("-\n");
    }

    private static void execute(BufferedReader br, BufferedWriter bw) throws IOException {
        int n = Integer.parseInt(br.readLine());
        sb = new StringBuffer(n * 4);

        for (int i = 0; i < n; i++) {
            int togo = Integer.parseInt(br.readLine());
            while (node < togo)
                sPush();
            if (!stack.empty() && stack.peek() != togo) {
                System.out.println("NO");
                return ;
            }
            sPop();
        }
        bw.write(sb.toString());
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            execute(br, bw);
        } catch (IOException e){ e.printStackTrace(); }
        finally { try { bw.close(); br.close(); }
        catch (IOException e){ e.printStackTrace(); }}
    }
}
