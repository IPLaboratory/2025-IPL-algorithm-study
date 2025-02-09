import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        String[] result = new String[t];

        for (int i = 0; i < t; i++) {
            String ps = sc.nextLine();
            int count = 0;
            boolean isTrue = true;

            for (char c : ps.toCharArray()) {
                if (c == '(') {
                    count++;
                } else if (c == ')') {
                    count--;
                }

                if (count < 0) {
                    isTrue = false;
                    break;
                }
            }

            if (count != 0) { isTrue = false; }

            result[i] = isTrue ? "YES" : "NO";
        }

        for (String res : result) {
            System.out.println(res);
        }

        sc.close();
    }
}
