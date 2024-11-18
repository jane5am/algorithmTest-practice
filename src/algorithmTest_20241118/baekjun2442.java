// 백준 2442번 별 찍기 - 5 / 난이도 : 브론즈 3
// 메모리 : 19928 KB, 시간 : 276 ms

// 문제
// 첫째 줄에는 별 1개, 둘째 줄에는 별 3개, ..., N번째 줄에는 별 2×N-1개를 찍는 문제
// 별은 가운데를 기준으로 대칭이어야 한다.

// 입력
// 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

// 출력
// 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.

package algorithmTest_20241118;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjun2442 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        for ( int i = 1; i <= num; i++){

            //공백
            for( int j = num; j > i; j--){
                System.out.print(" ");
            }

            //별
            for ( int k = 1 ; k <= (i*2)-1 ; k++ ){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}