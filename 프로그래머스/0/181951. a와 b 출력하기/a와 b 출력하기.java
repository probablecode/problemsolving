import java.util.Scanner;
import java.io.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            bw.write("a = " + a);
            bw.newLine();
            bw.write("b = " + b);
            bw.newLine();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                bw.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}