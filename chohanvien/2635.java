import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class j_2635 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 번째 수 T
        int T = Integer.parseInt(br.readLine());

        // 가장 긴 수열의 길이와 수열을 만들기 위한 두 번째 수
        int maxLength = 0;
        int bestB = 0;

        // 수열을 저장할 리스트 (최종적으로 가장 긴 수열을 저장)
        List<Integer> list = new ArrayList<>();

        // 가장 긴 수열을 찾기
        for(int B = 1; B <= T; B++) {
            // 각 B에 대해 수열을 생성할 리스트 temp
            List<Integer> temp = new ArrayList<>();
            temp.add(T); // 첫 번째 수 T
            temp.add(B); // 두 번째 수 B

            // 수열 생성: 두 번째 수부터 끝까지 계속 수열을 생성 (음수 X)
            while(temp.get(temp.size() - 2) >= temp.get(temp.size() - 1) && temp.get(temp.size() - 1) >= 0){
                int next = temp.get(temp.size() - 2) - temp.get(temp.size() - 1); // 이전 두 수의 차이를 구함
                temp.add(next);
            }

            // 현재 수열이 가장 긴 경우
            if(temp.size() > maxLength) {
                maxLength = temp.size();
                bestB = B;
                list = temp;
            }
        }

        // 가장 긴 수열의 길이
        System.out.println(maxLength);

        // 결과 출력
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
