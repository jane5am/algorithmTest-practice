// 백준 11021번 A+B - 7, 난이도 : 브론즈 5
// 메모리 14616KB, 시간 124ms
// 1. 테스트 케이스 갯수 N 입력받기
// 2. 두 수 입력 받아서 stringTokenizer로 자르기
// 3. for문 사용해서 두수 합쳐서 출력
package algorithmTest_20240610;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjun11021 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            sb.append("Case #"+i+": ");
            sb.append(Integer.parseInt(st.nextToken())+ Integer.parseInt(st.nextToken()));

            System.out.println(sb);
            sb.setLength(0);
        }



    }
}
