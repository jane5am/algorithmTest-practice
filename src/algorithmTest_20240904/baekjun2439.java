// 백준 2439번 별찍기2 / 난이도 : 브론즈 4
// 메모리 : 14188KB, 시간 : 112ms

// 문제
// 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
// 하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.

// 입력
// 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

// 출력
// 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.

package algorithmTest_20240904;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjun2439 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        // 1. 줄 수 입력받기
        int row = Integer.parseInt(br.readLine());

        // 2. 세로for문 먼저 돌리고 안에 가로 for문 돌리기
        for( int i = 1; i <= row; i++ ){
            for(int j = row-i; j > 0; j--){
                sb.append(" ");
            }
            for (int j = 0; j < i; j++ ){
                sb.append("*");
            }
            sb.append("\n");
        }

        System.out.println(sb);

    }
}
