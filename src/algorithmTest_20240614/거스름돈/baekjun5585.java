// 백준 5585번 거스름돈, 난이도 : 브론즈 2
// 메모리 14252KB, 시간 : 124ms
// 1. 지불한 돈 입력받기
// 2. 돈을 잔돈의 가장 큰 수 부터 나누어준다 > 카운트 세기

package algorithmTest_20240614.거스름돈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjun5585 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. 지불한 돈 입력받기
        int give = Integer.parseInt(br.readLine());
        int changes = 1000 - give; // 받을 거스름돈
        int cnt = 0; // 잔돈 갯수 세기
        int[] money = { 500, 100, 50, 10, 5, 1};

        for (int i = 0; i < money.length; i++) {
            cnt += (changes / money[i]);
            changes = changes % money[i];
        }

        System.out.println(cnt);
    }
}
