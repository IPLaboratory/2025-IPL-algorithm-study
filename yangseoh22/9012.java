import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());  // 케이스 수

        // VPS 검사
        for(int i = 0; i < T; i++) {
            String str = br.readLine();  // 문장 입력
            int idx = 0;  // 스택 역할의 변수

            // 문자 별로 체크
            for(int j = 0; j < str.length(); j++) {
                Character ch = str.charAt(j);

                // 왼쪽 괄호면 스택에 저장
                if (ch=='(') {
                    idx++;
                }
                // 오른쪽 괄호면 스택에서 삭제
                else if (ch==')') {
                    idx--;

                    // idx가 0보다 작으면 왼쪽 괄호가 없는데 오른쪽 괄호가
                    // 확인되었다는 뜻이므로 올바른 괄호가 아님
                    if(idx<0) break;
                }
            }

            // idx가 0일 때만 괄호 짝이 맞은 것
            if(idx == 0) sb.append("YES").append("\n");
            else sb.append("NO").append("\n");
        }

        System.out.println(sb);
    }
}