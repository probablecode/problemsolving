import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder ans = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                ans.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                ans.append(Character.toUpperCase(c));
            } else {
                ans.append(c);
            }
        }

        System.out.println(ans.toString());

    }
}