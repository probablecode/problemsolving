import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        StringBuilder sb = new StringBuilder(a.length());
        for (char c : a.toCharArray()) {
            if (Character.isLowerCase(c))
                sb.append(Character.toUpperCase(c));
            else if (Character.isUpperCase(c))
                sb.append(Character.toLowerCase(c));
            else
                sb.append(c);
        }
        System.out.print(sb);
    }
}