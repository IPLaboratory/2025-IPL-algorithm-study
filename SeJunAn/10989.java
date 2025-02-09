import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
        
        int cnt = Integer.parseInt(br.readLine());
        int[] list = new int[cnt]; 
        
        for (int i = 0; i < cnt; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(list); 
        
        for (int j = 0; j < cnt; j++) {
            bw.write(list[j] + "\n"); 
        }
        
        br.close();
        bw.flush(); 
        bw.close();
    }
}
