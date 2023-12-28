import java.util.Scanner;
public class Answer {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer(sc.next());
        System.out.println(sb.append(sc.next()));
    }
}