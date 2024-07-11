import java.util.Scanner;
import java.io.*;

public class Solution {
    public static void main(String[] args) {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            bw.write("!@#$%^&*(\\'\"<>?:;");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            
            try {
                bw.close();
            }
            catch(IOException e) {
                e.printStackTrace();
            }
        }
    }
}