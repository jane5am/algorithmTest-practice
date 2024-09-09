// 백준 11720번 숫자의 합 / 난이도 : 브론즈 4
// 메모리 : 14256KB, 시간 : 100ms

// 문제
// N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

// 입력
// 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.

// 출력
// 입력으로 주어진 숫자 N개의 합을 출력한다.

package algorithmTest_20240908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjun15552 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 1. 반복되는 횟수 입력받기
        int repeatNum = Integer.parseInt(br.readLine());

        // 2. 숫자 입력 받기
        String num = br.readLine();
        int sum = 0;

        //3. for문으로 입력받은 숫자만큼 문자열 입력받기
        for(int i = 0; i < repeatNum ; i++ ){
          sum += num.charAt(i) - '0';
        }
        sb.append(sum);
        System.out.println(sb);

    }
}
