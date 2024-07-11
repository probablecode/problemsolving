import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Object oa = new Object();
        Object ob = oa;
        //new Object();
        System.out.println(oa.equals(ob));
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for (int i = 0; i < a.length(); i++)
            System.out.println(a.charAt(i));
    }
}