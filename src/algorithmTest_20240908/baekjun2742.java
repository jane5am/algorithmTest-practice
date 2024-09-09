// 백준 2742번 기찍 N / 난이도 : 브론즈 4
// 메모리 : 18168KB, 시간 : 180ms

// 문제
// 자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.

// 입력
// 첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.

// 출력
// 첫째 줄부터 N번째 줄 까지 차례대로 출력한다.

package algorithmTest_20240908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjun2742 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 1. 숫자 입력받기
        int num = Integer.parseInt(br.readLine());

        //2. for문으로 num-1씩 1까지 출력
        for(int i = num; i > 0 ; i-- ){
            sb.append(i).append("\n");
        }

        System.out.println(sb);

    }
}
