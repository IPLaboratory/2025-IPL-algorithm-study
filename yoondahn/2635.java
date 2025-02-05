import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());    // 첫 번째 수

        int maxLength = 0;
        ArrayList<Integer> maxList = new ArrayList<>();

        // 최대 개수의 수들이 나오는 두 번째 수 구하기
        for (int second = n/2; second <= n; second++) {
            ArrayList<Integer> currentList = numbers_continue(n, second);
            if (currentList.size() > maxLength) {
                maxList = currentList;
                maxLength = currentList.size();
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(maxLength).append("\n");
        for (int i : maxList) {
            sb.append(i).append(" ");
        }
        System.out.print(sb);
    }

    // 세 번째 이후의 수 구하기
    public static ArrayList<Integer> numbers_continue(int n1, int n2) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(n1);
        list.add(n2);

        int next;
        for (int i = 0; i < list.size() - 1; i++) {
            next = list.get(i) - list.get(i+1); // 앞의 앞의 수 - 앞의 수
            if (next < 0) break;    // 음의 정수일 경우 반복문 종료
            else list.add(next);
        }
        return list;
    }
}