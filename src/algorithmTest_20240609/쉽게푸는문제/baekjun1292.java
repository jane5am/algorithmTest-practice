// 백준 1292번 쉽게 푸는 문제, 난이도 브론즈 1
// 메모리 14420KB, 시간 132ms
// 1. 시작과 끝 정수를 입력받는다
// 2. 이중for문으로 cnt하면서 시작/끝 사이에 있는 경우 더해준다

package algorithmTest_20240609.쉽게푸는문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjun1292 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        int sum = 0; // 합
        int count = 0; //반복횟수를 체크하기 위한 변수

        for(int i = 1; i <= end ; i++) {
            for(int j = 1 ; j <= i ; j++) {
                count++;

                if(start <= count && count <= end) {
                    sum = sum + i;

                }
            }
        }

        System.out.println(sum);
    }
}
