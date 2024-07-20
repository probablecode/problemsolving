import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    private static StringBuilder sb;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] charArray = sc.nextLine().toCharArray();

        sb = new StringBuilder(charArray.length);

        int idx = 0;
        while (idx < charArray.length) {
            if (charArray[idx] == '<')
                idx = processTag(charArray, idx);
            else if (charArray[idx] != ' ')
                idx = processWord(charArray, idx);
            else
                sb.append(charArray[idx++]);
        }
        System.out.println(sb.toString());
    }

    private static int processTag(char[] charArray, int idx) {
        int i = idx;
        while (i < charArray.length && charArray[i] != '>')
            sb.append(charArray[i++]);
        sb.append(charArray[i++]);
        return i;
    }
    private static int processWord(char[] charArray, int idx) {
        int i = idx;
        Stack<Character> stack = new Stack<>();
        while (i < charArray.length && charArray[i] != ' ' && charArray[i] != '<')
            stack.push(charArray[i++]);
        while (!stack.empty())
            sb.append(stack.pop());
        return i;
    }
}
