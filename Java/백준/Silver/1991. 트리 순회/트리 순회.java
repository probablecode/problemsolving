import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static int N;
    public static int LEN;
    public static HashMap<Character, Node> tree = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String node = br.readLine();
            tree.put(node.charAt(0), new Node(node.charAt(2), node.charAt(4)));
        }
        preOrder('A');
        System.out.println();
        midOrder('A');
        System.out.println();
        postOrder('A');
        System.out.println();
    }

    private static void preOrder(char ch) {
        System.out.print(ch);
        Node node = tree.get(ch);
        if (node.left != '.')
            preOrder(node.left);
        if (node.right != '.')
            preOrder(node.right);
    }
    private static void midOrder(char ch) {
        Node node = tree.get(ch);
        if (node.left != '.')
            midOrder(node.left);
        System.out.print(ch);
        if (node.right != '.')
            midOrder(node.right);
    }
    private static void postOrder(char ch) {
        Node node = tree.get(ch);
        if (node.left != '.')
            postOrder(node.left);
        if (node.right != '.')
            postOrder(node.right);
        System.out.print(ch);
    }
    static class Node {
        public Node(char l, char r) { left = l; right = r;}
        char left;
        char right;
    }
}