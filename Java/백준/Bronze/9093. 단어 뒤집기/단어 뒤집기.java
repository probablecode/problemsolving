import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try { execute(br, bw); }
        catch (IOException e) { e.printStackTrace(); }
        finally { try { br.close(); bw.close(); } catch (IOException e) { e.printStackTrace();}}
}

    public static void execute(BufferedReader br, BufferedWriter bw) throws IOException {
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringBuffer sb = new StringBuffer();
            Stack<Character> stack = new Stack<>();
            String input = br.readLine();
            String[] strs = input.split("\\s+");
            for (String str : strs) {
                for (char c : str.toCharArray())
                    stack.push(c);
                while (!stack.isEmpty()) {
                    sb.append(stack.peek());
                    stack.pop();
                }
                sb.append(' ');
            }
            sb.deleteCharAt(sb.length() - 1);
            bw.write(sb.toString());
            bw.newLine();
        }
    }
}