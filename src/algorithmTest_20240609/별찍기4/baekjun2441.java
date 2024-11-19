// 백준 2441번 별 찍기 - 4 , 난이도 브론즈 3
// 메모리 14992KB, 시간 144ms
// 1. 숫자 N입력받기
// 2. for(n<5){for( ) for() }
package algorithmTest_20240609.별찍기4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjun2441 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < i; j++) {
                sb.append(" ");
            }
            System.out.print(sb);
            sb.setLength(0);

            for(int j = N-i; j > 0; j--) {
                sb.append("*");
            }
            System.out.print(sb);
            System.out.println();
            sb.setLength(0);
        }
    }
}
