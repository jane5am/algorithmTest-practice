// 메모리 14168KB, 시간 128ms
// 1. 문자열 입력받기
// 2. 반복문으로 StringBilder에 10개씩 담기
// 3. 10개씩 담긴 문자열 출력

package algorithmTest_20240601.열개씩끊어출력하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjun11721 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String sen = bf.readLine(); // 1. 문자열 입력받기

        for (int i = 0; i < sen.length(); i++) {
            sb.append(sen.charAt(i)); // 2. 반복문으로 StringBilder에 10개씩 담기
            if ( (i + 1) % 10 == 0 ) { // 10개 채워지면 줄바꿈
                System.out.println(sb);
                sb.setLength(0); // StringBuilder 초기화
            }
        }

        // 마지막에 남아 있는 문자 출력
        if (sb.length() > 0) {
            System.out.println(sb);
        }
    }
}
