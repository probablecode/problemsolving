import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int len = a.length();
        char[] charArr = new char[len];
        for (int i = 0; i < len; i++) {
            char ch = a.charAt(i);
            if (ch <='Z')
                charArr[i] = ch + ('a' - 'A');
            else if ('a' <= ch)
                charArr[i] = ch + ('A' - 'a');               
        }
        System.out.println(new String(charArr));
    }
}