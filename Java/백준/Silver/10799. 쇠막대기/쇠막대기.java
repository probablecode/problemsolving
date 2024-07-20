import java.util.Scanner;
import java.util.Stack;
public class Main {

    private static Stack<Character> stack = new Stack<>();
    private static int brokes = 0;
    private static int lasers = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] charArray = sc.nextLine().toCharArray();
        int len = charArray.length;
        int idx = 0;
        while (idx < len) {
            if (charArray[idx] == '(') {
                if (charArray[idx + 1] == ')') {
                    laser();
                    idx++;
                }
                else
                    stack.push('(');
            }
            else
                stack.pop();
            idx++;
        }
        System.out.println(len / 2 - lasers + brokes);
    }
    private static void laser() {
        lasers++;
        brokes += stack.size();
    }
}