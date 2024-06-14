// 백준 14659번 한조서열정리하고옴ㅋㅋ , 난이도 : 브론즈 1
// 메모리 : 20252KB, 시간 : 216ms
// 천계에 맥도날드가 생겨 용들이 살이 찐 탓에 용들은 자신보다 낮은 봉우리에 서있는 적들만 처치할 수 있게 되었다.
// 또한 용들은 처음 출발한 봉우리보다 높은 봉우리를 만나면 그대로 공격을 포기하고 금강산자락에 드러누워 낮잠을 청한다고 한다.
// 봉우리의 높이는 모두 다르고 모든 용들은 오른쪽으로만 나아가며, 중간에 방향을 틀거나, 봉우리가 무너지거나 솟아나는 경우는 없다.
// 입력 : 첫째 줄에 봉우리의 수 겸 활잡이의 수 N이 주어진다.
//       (1 ≤ N ≤ 30,000) 둘째 줄에 N개 봉우리의 높이가 왼쪽 봉우리부터 순서대로 주어진다.
//       (1 ≤ 높이 ≤ 100,000) 각각 봉우리의 높이는 중복 없이 유일하다.
// 출력 : 최고의 활잡이가 처치할 수 있는 적의 최대 숫자를 출력한다.
//
// 1. 봉우리의 수 N 입력받기
// 2. N개의 봉우리 높이 입력받기 > 배열로
// 3. for문 사용해서 처음부터 값비교해가며 cnt++, 만약 더 큰 수 만나면 0으로 초기화
// 4. 가장 큰 cnt값 출력

package algorithmTest_20240614.한조서열정리하고옴ㅋㅋ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjun14659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. 봉우리의 수 N 입력받기
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        int numMax = 0;
        int maxCnt = 0;
        // 2. N개의 봉우리 높이 입력받기 > 배열로
        String[] length = (br.readLine()).split(" ");
        int[] lengthArr = new int[N];

        // 3. for문 사용해서 처음부터 값비교해가며 cnt++, 만약 더 큰 수 만나면 0으로 초기화
        for (int i = 0; i < N; i++) {
            lengthArr[i] = Integer.parseInt(length[i]);
            if (lengthArr[i] > numMax){
                numMax = lengthArr[i];
                cnt = 0;
            }

            if (cnt > maxCnt){
                maxCnt = cnt;
            }
            cnt++;
        }

        // 4. 가장 큰 cnt값 출력
        System.out.println(maxCnt);
    }
}
