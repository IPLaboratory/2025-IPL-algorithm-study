import java.io.*;

// 커밋메시지 변경
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 퇴사일
        int quit_day = Integer.parseInt(br.readLine());

        // 시간과 급여 배열
        int[] time = new int[quit_day + 1];
        int[] wage = new int[quit_day + 1];
        int[] dp = new int[quit_day + 2];  // dp 배열 (퇴사일까지 얻을 수 있는 최대 급여)

        // 입력 처리
        for (int i = 1; i <= quit_day; i++) {
            String[] input = br.readLine().split(" ");
            time[i] = Integer.parseInt(input[0]);
            wage[i] = Integer.parseInt(input[1]);
        }

        // 역순으로 계산 (퇴사일 이전부터 시작)
        for (int i = quit_day; i >= 1; i--) {
            // 일을 끝낼 수 있는 날이 퇴사일을 넘지 않으면, 해당 일을 할 수 있음
            if (i + time[i] <= quit_day + 1) {
                dp[i] = Math.max(dp[i + 1], wage[i] + dp[i + time[i]]);
            } else {
                dp[i] = dp[i + 1];  // 일을 할 수 없으면 그 날의 최대 급여는 그대로
            }
        }

        // 첫 번째 날부터 시작할 때 얻을 수 있는 최대 급여가 정답
        bw.write(dp[1] + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}