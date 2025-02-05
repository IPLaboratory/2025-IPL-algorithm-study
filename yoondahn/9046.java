import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            HashMap<Character, Integer> haspMap = new HashMap<>();

            // 빈도수 체크
            for (int j = 0; j < s.length(); j++) {
                Character c = s.charAt(j);
                if (c != ' ') {
                    if (haspMap.containsKey(c)) {
                        haspMap.put(c, haspMap.get(c) + 1);
                    } else haspMap.put(c, 1);
                }
                haspMap.put(' ', 0);    // 비교군을 위해 공백 문자 삽입
            }

            // 가장 빈번하게 나타나는 문자 찾기
            Character frequency = ' ';
            boolean frequencyExists = false;
            for (Character c : haspMap.keySet()) {
                if (c != ' ') {
                    if (haspMap.get(c) == haspMap.get(frequency)) {
                        frequencyExists = true;
                    } else if (haspMap.get(c) > haspMap.get(frequency)) {
                        frequency = c;
                        frequencyExists = false;
                    }
                }
            }
            if (frequencyExists) {
                sb.append("?\n");
            } else {
                sb.append(frequency).append("\n");
            }
        }
        System.out.println(sb);
    }
}