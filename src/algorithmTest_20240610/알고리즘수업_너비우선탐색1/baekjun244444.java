// 백준 24479번 알고리즘 수업 - 너비 우선 탐색 1 , 난이도 : 실버 2
// 메모리 104600KB, 시간 1612ms

package algorithmTest_20240610.알고리즘수업_너비우선탐색1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class baekjun244444 {
    // 그래프를 저장할 인접 리스트 배열
    static List<Integer>[] graph;
    // 방문 여부를 저장할 배열
    static boolean[] visited;

    // 각 정점의 방문 순서를 저장할 배열
    static int[] order;
    // 방문 순서를 위한 카운터
    static int counter = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 정점 수
        int M = Integer.parseInt(st.nextToken()); // 간선 수
        int R = Integer.parseInt(st.nextToken()); // 시작 정점

        visited = new boolean[N + 1];
        graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        order = new int[N + 1];
        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            graph[num1].add(num2);
            graph[num2].add(num1); // 양방향 그래프인 경우에만 추가
        }

        // 각 정점의 인접 리스트를 오름차순으로 정렬
        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);
        }

        bfs(R);

        // 결과 출력
        for (int i = 1; i <= N; i++) {
            System.out.println(order[i]);
        }
    }

    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;
        order[start] = counter++;

        while (!queue.isEmpty()) {//큐가 비어있지않으면 계속 진행
            int vertex = queue.poll();

            for (int neighbor : graph[vertex]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    order[neighbor] = counter++;
                    queue.offer(neighbor);
                }
            }
        }
    }
}