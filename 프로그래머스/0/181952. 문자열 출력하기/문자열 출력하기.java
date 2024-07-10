import java.util.Scanner;
import java.io.*;

public class Solution {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            
            String str = br.readLine();
            bw.write(str);
            
            bw.close();
            br.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }        
    }
}