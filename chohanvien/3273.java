import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class j_3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int x = Integer.parseInt(br.readLine());

        HashSet<Integer> set = new HashSet<>();
        int get = 0;

        for (String num : input) {
            int val = Integer.parseInt(num);
            if (set.contains(x - val)) {
                get++;
            }
            set.add(val);
        }

        System.out.println(get);
    }
}
