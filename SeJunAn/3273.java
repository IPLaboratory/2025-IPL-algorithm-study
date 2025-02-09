import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
        
        // 입력 3인방
        int size = Integer.parseInt(br.readLine());
        String[] temp = br.readLine().split(" ");
        int sum = Integer.parseInt(br.readLine());
        
        int list[] = new int[size];
        int cnt = 0;
        
        for (int i = 0; i < size; i++) {
        	list[i] = Integer.parseInt(temp[i]);
        }
        
        for(int j = 0; j < size - 1; j++) {
        	for(int k = j + 1; k < size; k++) {
        		if(list[j] + list[k] == sum) {
        			cnt++;
        			break;
        		}
        	}
        }
        bw.write(cnt + "\n");

        br.close();
        bw.flush(); 
        bw.close();
    }
}
