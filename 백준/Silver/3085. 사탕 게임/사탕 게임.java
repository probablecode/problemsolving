import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        char[][] board = new char[N][N];
        init(N, sc, board);

        int max = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - 1; j++) {
                char temp = board[i][j];
                if (temp != board[i][j + 1]) {
                    swap(board, i, j, i, j + 1);
                    max = checkMax(board, N, max);
                    swap(board, i, j, i, j + 1);
                }
            }
        }
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N; j++) {
                char temp = board[i][j];
                if (temp != board[i + 1][j]) {
                    swap(board, i, j, i + 1, j);
                    max = checkMax(board, N, max);
                    swap(board, i, j, i + 1, j);
                }
            }
        }
        System.out.println(max);
    }

    private static int checkMax(char[][] board, int N, int preMax) {
        int max = 0;

        int count = 0;
        for (int i = 0; i < N; i++) {
            char ch = ' ';
            for (int j = 0; j < N; j++) {
                if (board[i][j] != ch) {
                    max = Math.max(max, count);
                    ch = board[i][j];
                    count = 1;
                }
                else {
                    count++;
                }
            }
            max = Math.max(max, count);
            count = 0;
        }

        count = 0;
        for (int j = 0; j < N; j++) {
            char ch = ' ';
            for (int i = 0; i < N; i++) {
                if (board[i][j] != ch) {
                    max = Math.max(max, count);
                    ch = board[i][j];
                    count = 1;
                } else {
                    count++;
                }
            }
            max = Math.max(max, count);
            count = 0;
        }
        return Math.max(max, preMax);
    }

    private static void swap(char[][] board, int i0, int j0, int i, int j) {
        char temp = board[i0][j0];
        board[i0][j0] = board[i][j];
        board[i][j] = temp;
    }

    private static void init(int N, Scanner sc, char[][] board) {
        for (int i = 0; i < N; i++) {
            String line = sc.nextLine();
            board[i] = line.toCharArray();
        }
    }

}
