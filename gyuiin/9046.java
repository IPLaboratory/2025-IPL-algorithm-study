import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < t; i++) {
            String input = scanner.nextLine().replaceAll(" ", "");
            HashMap<Character, Integer> map = new HashMap<>();

            for (char c : input.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            int freq = 0;
            char result = '?';
            boolean isDuplicate = false;

            for (char key : map.keySet()) {
                int num = map.get(key);
                if (num > freq) {
                    freq = num;
                    result = key;
                    isDuplicate = false;
                } else if (num == freq) {
                    isDuplicate = true;
                }
            }

            System.out.print(isDuplicate ? "?" : result);
            if (i < t - 1) {
                System.out.println();
            }
        }

        scanner.close(); // 리소스 닫기
    }
}

