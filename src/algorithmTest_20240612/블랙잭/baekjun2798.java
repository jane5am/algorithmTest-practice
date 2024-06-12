// 백준 2798번, 난이도 : 브론즈 2
// 메모리 : 14160KB, 시간 : 124ms
// 입력 : 첫째 줄에 카드의 개수 N(3 ≤ N ≤ 100)과 M(10 ≤ M ≤ 300,000)이 주어진다.
//       둘째 줄에는 카드에 쓰여 있는 수가 주어지며, 이 값은 100,000을 넘지 않는 양의 정수이다.
//       합이 M을 넘지 않는 카드 3장을 찾을 수 있는 경우만 입력으로 주어진다.
// 출력 : 첫째 줄에 M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 출력한다.

// 1. 카드 갯수 N, 합 M 입력받기
// 2. 둘째 줄 카드 숫자들 int[]에 넣기
// 3. 세 수를 for문 세번 돌려서 합쳐보고 > M보다 작으면서 가장 큰수를 업데이트

package algorithmTest_20240612.블랙잭;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjun2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 1. 카드 갯수 N, 합 M 입력받기
        int N = Integer.parseInt(st.nextToken()); // 카드 갯수 N
        int M = Integer.parseInt(st.nextToken()); // 세 수의 합 기준 M
        int[] arr = new int[N];
        int max = 0;

        st = new StringTokenizer(br.readLine());

        // 2. 둘째 줄 카드 숫자들 int[]에 넣기
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 3. 세 수를 for문 세번 돌려서 합쳐보고 > M보다 작으면서 가장 큰수를 업데이트
        for( int i = 0; i < N-2; i++ ) {
            for( int j = i + 1; j < N-1; j++ ) {
                for( int k = j + 1; k < N; k++ ) {
                    if(arr[i] + arr[j] + arr[k] <= M && max < arr[i] + arr[j] + arr[k]){
                        max = arr[i] + arr[j] + arr[k];
                    }
                }
            }
        }

        System.out.println(max);
    }
}
