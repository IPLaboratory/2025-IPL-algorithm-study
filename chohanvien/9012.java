import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class j_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        String[] arr = new String[T];

        for (int i = 0; i < T; i++) {
            arr[i] = br.readLine();
        }

        // ✅ 이 부분을 처음에 잘못 풀이함 !
        for (int i = 0; i < T; i++) {
            Stack<Character> stack = new Stack<>();
            String s = arr[i];
            boolean ck = true; // 올바른 괄호 문자열인지 확인

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '(') {
                    stack.push('(');
                } else if (stack.empty()) {
                    System.out.println("NO");
                    ck = false; // NO 출력 후 더 이상 검사할 필요 없음
                    break;
                } else {
                    stack.pop();
                }
            }

            if (ck) { // NO가 출력되지 않은 경우에만 YES 출력
                if (stack.empty()) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
