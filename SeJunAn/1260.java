import java.util.*;

// 커밋 메시지 변경
public class Main {
    static int N, M, V;
    static List<Integer>[] adj;
    static boolean[] vis;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        V = sc.nextInt();

        adj = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj[u].add(v);
            adj[v].add(u);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(adj[i]);
        }

        vis = new boolean[N + 1];
        DFS(V);
        System.out.println();

        vis = new boolean[N + 1];
        BFS(V);
    }

    public static void DFS(int cur) {
        System.out.print(cur + " ");
        vis[cur] = true;

        for (int nxt : adj[cur]) {
            if (!vis[nxt]) {
                DFS(nxt);
            }
        }
    }

    public static void BFS(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        vis[start] = true;

        while (!q.isEmpty()) {
            int cur = q.poll();
            System.out.print(cur + " ");

            for (int nxt : adj[cur]) {
                if (!vis[nxt]) {
                    vis[nxt] = true;
                    q.add(nxt);
                }
            }
        }
    }
}
