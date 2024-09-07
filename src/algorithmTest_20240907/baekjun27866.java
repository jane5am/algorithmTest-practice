// 백준 9086번 문자열 / 난이도 : 브론즈 5
// 메모리 : 13972KB, 시간 : 96ms

// 문제
// 문자열을 입력으로 주면 문자열의 첫 글자와 마지막 글자를 출력하는 프로그램을 작성하시오.

// 입력
// 입력의 첫 줄에는 테스트 케이스의 개수 T(1 ≤ T ≤ 10)가 주어진다.
// 각 테스트 케이스는 한 줄에 하나의 문자열이 주어진다. 문자열은 알파벳 A~Z 대문자로 이루어지며 알파벳 사이에 공백은 없으며 문자열의 길이는 1000보다 작다.

// 출력
// 각 테스트 케이스에 대해서 주어진 문자열의 첫 글자와 마지막 글자를 연속하여 출력한다.

package algorithmTest_20240907;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjun27866 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        // 1. 숫자 입력받기
        int num = Integer.parseInt(br.readLine());

        String str;
        char firstChar;
        char lastChar;
        //2. for문으로 입력받은 숫자만큼 문자열 입력받기
        for(int i = 0; i < num ; i++ ){
            str = br.readLine();
            firstChar = str.charAt(0);
            lastChar = str.charAt(str.length()-1);

            sb.append(firstChar).append(lastChar).append("\n");
        }

        System.out.println(sb);
    }
}
