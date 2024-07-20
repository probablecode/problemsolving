import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Stack;

// 예를들어
public class Main {
    private static Stack<Character> lStack = new Stack<>();
    private static Stack<Character> rStack = new Stack<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String preStr = br.readLine();
        init(preStr);
        int M = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++) {
            String cmd = br.readLine();
            if (cmd.equals("L"))
                sendLToR();
            else if (cmd.equals("D"))
                sendRToL();
            else if (cmd.equals("B"))
                popL();
            else if (cmd.startsWith("P"))
                pushL(cmd.split(" ")[1]);
        }
        System.out.println(makeString());
        br.close();
//        bw.close();
    }

    private static String makeString() {
        int lLen = lStack.size();
        int rLen = rStack.size();
        char[] charArr = new char[lLen + rLen];
        for (int i = 1 ; i <= lLen; i++)
            charArr[lLen - i] = lStack.pop();
        for (int i = 0 ; i < rLen; i++)
            charArr[lLen + i] = rStack.pop();
        return new String(charArr);
    }

    private static void pushL(String ch) {
        lStack.push(ch.charAt(0));
    }

    private static void popL() {
        if (!lStack.empty())
            lStack.pop();
    }

    private static void sendRToL() {
        if (!rStack.empty())
            lStack.push(rStack.pop());
    }

    private static void sendLToR() {
        if (!lStack.empty()) {
            rStack.push(lStack.pop());
        }
    }

    private static void init(String preStr) {
        for (char ch : preStr.toCharArray()) {
            lStack.push(ch);
        }
    }
}
