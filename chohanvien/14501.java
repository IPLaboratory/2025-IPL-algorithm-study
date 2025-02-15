import java.util.*;

public class j_14501 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    int[] T = new int[N + 1]; // 상담 기간
    int[] P = new int[N + 1]; // 상담 금액
    int[] dp = new int[N + 2]; // 최대 수익 저장 DP 배열

        for (int i = 1; i <= N; i++) {
        T[i] = sc.nextInt();
        P[i] = sc.nextInt();
    }

        for (int i = N; i >= 1; i--) {
        // 해당 상담이 끝나는 날
        int nextDay = i + T[i];

        // 퇴사 전까지 상담 가능하면
        if (nextDay <= N + 1) {
            dp[i] = Math.max(P[i] + dp[nextDay], dp[i + 1]);
        // 상담을 할 수 없음
        } else {
            dp[i] = dp[i + 1];
        }
    }
        // 최대 수익
        System.out.println(dp[1]);
    }
}
