// 백준 1978번 소수 찾기/ 난이도 : 브론즈 2
// 메모리 : 14132 KB, 시간 : 108 ms

// 문제
// 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.

// 입력
// 첫 줄에 수의 개수 N이 주어진다. N은 100이하이다.
// 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.

// 출력
// 주어진 수들 중 소수의 개수를 출력한다.

package algorithmTest_20241125;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjun1978 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int TC = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int[] intArr = new int[arr.length];

        for ( int i = 0; i < arr.length; i++ ){
            intArr[i] = Integer.parseInt(arr[i]);
        }

        int cnt = 0; // 나머지 있는지 판별
        int score = 0; // 소수의 갯수
        for ( int i = 0; i < arr.length; i++){
            for ( int j = 2; j < intArr[i]; j++ ){
                if (  intArr[i] % j == 0 ){
                    cnt++;
                    break;
                }
            }
            if ( cnt == 0 && (intArr[i] != 1) ){
                score++;
            }
            cnt = 0;
        }

        System.out.print(score);

    }
}