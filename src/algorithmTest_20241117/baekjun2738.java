// 백준 2738번 행렬 덧셈 / 난이도 : 브론즈 3
// 메모리 : 16948 KB, 시간 : 148 ms

// 문제
// N*M크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램을 작성하시오.

// 입력
// 첫째 줄에 행렬의 크기 N 과 M이 주어진다. 둘째 줄부터 N개의 줄에 행렬 A의 원소 M개가 차례대로 주어진다.
// 이어서 N개의 줄에 행렬 B의 원소 M개가 차례대로 주어진다.
// N과 M은 100보다 작거나 같고, 행렬의 원소는 절댓값이 100보다 작거나 같은 정수이다.

// 출력
// 첫째 줄부터 N개의 줄에 행렬 A와 B를 더한 행렬을 출력한다. 행렬의 각 원소는 공백으로 구분한다.

package algorithmTest_20241117;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjun2738 {
    public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringBuilder sb = new StringBuilder();

       String[] testCase = br.readLine().split(" ");
       int N = Integer.parseInt(testCase[0]);
       int M = Integer.parseInt(testCase[1]);

       int[][] num = new int[N][M];
       for( int i = 0; i < N; i++ ){
           String[] temp = br.readLine().split(" ");
           for(int j = 0; j < M; j++){
                num[i][j] = Integer.parseInt(temp[j]);
           }
       }

        for( int i = 0; i < N; i++ ){
            String[] temp = br.readLine().split(" ");
            for(int j = 0; j < M; j++){
                num[i][j] += Integer.parseInt(temp[j]);
            }
        }

        for( int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                sb.append(num[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);

    }
}