// 백준 10817번 세 수 / 난이도 : 브론즈 3
// 메모리 : 14332 KB, 시간 : 108 ms

// 문제
// 세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오.

// 입력
// 첫째 줄에 세 정수 A, B, C가 공백으로 구분되어 주어진다. (1 ≤ A, B, C ≤ 100)

// 출력
// 두 번째로 큰 정수를 출력한다.

package algorithmTest_20241114;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baekjun10817 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] T = br.readLine().split(" ");
        int[] num = new int[3];
        for( int i = 0; i < T.length; i ++){
            num[i] = Integer.parseInt(T[i]);
        }

        Arrays.sort(num);

        System.out.println(num[1]);

    }
}