import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int start = Integer.parseInt(br.readLine());
        List<Integer> longest = new ArrayList<>();

        for (int second = 1; second <= start; second++) {
            List<Integer> seq = new ArrayList<>();
            seq.add(start);
            seq.add(second);

            while (true) {
                int next = seq.get(seq.size() - 2) - seq.get(seq.size() - 1);
                if (next < 0) break;
                seq.add(next);
            }

            if (seq.size() > longest.size()) {
                longest = seq;
            }
        }

        System.out.println(longest.size());
        for (int n : longest) {
            System.out.print(n + " ");
        }
    }
}
