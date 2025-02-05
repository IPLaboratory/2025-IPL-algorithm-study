import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            Stack<Character> stack = new Stack<>();
            String input = br.readLine();
            boolean VPS = false;

            //입력 문자열의 각 문자를 검사
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == '(') {   // 여는 괄호일 경우
                    stack.push(input.charAt(j));
                    VPS = false;
                } else {    // 닫는 괄호일 경우
                    if (stack.isEmpty()) {
                        VPS = false;
                        break;
                    }
                    stack.pop();
                    if (stack.isEmpty()) VPS = true;
                }
            }
            if (VPS) sb.append("YES\n");
            else sb.append("NO\n");
        }
        System.out.print(sb);
    }
}