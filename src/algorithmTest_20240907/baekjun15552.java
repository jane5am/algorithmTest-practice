// 백준 15552번 빠른 A+B / 난이도 : 브론즈 4
// 메모리 : 281584KB, 시간 : 836ms

// 입력
// 첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.

// 출력
//각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.

package algorithmTest_20240907;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjun15552 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 1. 숫자 입력받기
        int num = Integer.parseInt(br.readLine());

        String str;

        //2. for문으로 입력받은 숫자만큼 문자열 입력받기
        for(int i = 0; i < num ; i++ ){
            str = br.readLine();
            String[] arrString = str.split(" ");
            int sum = Integer.parseInt(arrString[0]) + Integer.parseInt(arrString[1]);
            sb.append(sum).append("\n");
        }

        System.out.println(sb);

    }
}
