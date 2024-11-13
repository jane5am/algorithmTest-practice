// 백준 10872번 팩토리얼 / 난이도 : 브론즈 3
// 메모리 : 14252 KB, 시간 : 104 ms

// 문제
// 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.

// 입력
// 첫째 줄에 정수 N(0 ≤ N ≤ 12)이 주어진다.

// 출력
// 첫째 줄에 N!을 출력한다.

package algorithmTest_20241112;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjun10872 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int mul = 1;

        for(int i = 2; i <= N; i++){
            mul = mul * i;
        }

        if ( N == 0){
            mul = 1;
        }

        System.out.println(mul);
    }
}