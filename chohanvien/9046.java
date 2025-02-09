import java.io.*;

public class j_9046 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //문자의 개수를 알기 위한 T를 입력받음
        int T = Integer.parseInt(br.readLine());

        //문자열을 저장할 arr 배열을 선언하고 입력 받음
        String[] arr = new String[T];

        for (int i = 0; i < T; i++) {
            arr[i] = br.readLine();
        }

        //각 문자열에서 알파벳 빈도 수를 계산함
        for (int i = 0; i < T; i++) {
            int[] alphabet = new int[26];

            for (int j = 0; j < arr[i].length(); j++) {
                char ch = arr[i].charAt(j);
                if (ch >= 'a' && ch <= 'z') {
                    alphabet[ch - 'a']++;
                }
            }

            // 최빈 문자 및 동률 여부 확인
            int ck = 0;
            char maxChar = '?';
            boolean tie = false;

            for (int k = 0; k < alphabet.length; k++) {
                if (alphabet[k] > ck) {
                    ck = alphabet[k];
                    maxChar = (char) ('a' + k);
                    tie = false;
                } else if (alphabet[k] == ck) {
                    tie = true;
                }
            }

            //결과 출력
            System.out.println(tie ? "?" : maxChar);
        }
    }
}
