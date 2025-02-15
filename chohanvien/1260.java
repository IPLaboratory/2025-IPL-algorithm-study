import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class j_1260_y {

    static int N, M, V;
    static int[][] Graph;
    static boolean[] visited;


    // 재귀함수로 구현한 DFS
    static void dfs(int node) {
        visited[node] = true;  // 현재 노드를 방문했다고 표시
        System.out.print(node +  " ");  // 현재 노드 출력

        // 인접 노드를 순회
        for(int next = 0; next <= N; ++next ) {
            // 아직 방문하지 않은 노드이며, 간선이 존재한다면
            if(!visited[next] && Graph[node][next] != 0 ) {
                dfs(next);  // 해당 노드로 DFS 진행
            }
        }
    }

    //BFS
    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(start);
        visited[start] = true;

        while(!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for(int next = 1; next <= N; ++next) {
                if(!visited[next] && Graph[node][next] != 0 ) {
                    visited[next] = true;
                    queue.offer(next);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        // 1. 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        Graph = new int[N+1][N+1];
        visited = new boolean[N+1];

        // 2. 간선 정보를 저장
        for (int i = 0; i <M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            Graph[u][v] = Graph[v][u] = 1;
        }
        //3. DFS 구하기
        dfs(V);
        System.out.println("");
        // 4. 방문 배열 초기화 후 BFS 구하기
        Arrays.fill(visited, false);
        bfs(V);
    }
}
