import java.io.*;
public class Main {
    public static void main(String args[]) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        try {
            String input = br.readLine();
            String[] inputs =input.split("\\s");
            int answer = 0;
            for (String toInt : inputs) {
                answer += Integer.parseInt(toInt);
            }
            bw.write(Integer.toString(answer));
            bw.flush();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
        finally {
            try {
                bw.close();
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
    }
}