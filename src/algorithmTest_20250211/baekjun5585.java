// 백준 5585번 거스름돈 / 난이도 : 브론즈 2
// 메모리 : 14208	KB, 시간 : 108 ms

// 문제
// 타로는 자주 JOI잡화점에서 물건을 산다.
// JOI잡화점에는 잔돈으로 500엔, 100엔, 50엔, 10엔, 5엔, 1엔이 충분히 있고, 언제나 거스름돈 개수가 가장 적게 잔돈을 준다.
// 타로가 JOI잡화점에서 물건을 사고 카운터에서 1000엔 지폐를 한장 냈을 때, 받을 잔돈에 포함된 잔돈의 개수를 구하는 프로그램을 작성하시오.

// 입력
// 입력은 한줄로 이루어져있고, 타로가 지불할 돈(1 이상 1000미만의 정수) 1개가 쓰여져있다.

// 출력
// 제출할 출력 파일은 1행으로만 되어 있다. 잔돈에 포함된 매수를 출력하시오.

package algorithmTest_20250211;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjun5585 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] changeType = {500, 100, 50, 10, 5, 1};

        int money = Integer.parseInt(br.readLine()); // 낼 돈
        int change = 1000 - money; // 거스름 돈
        int changeCnt = 0; // 거스름돈 갯수

        for(int i = 0; i < changeType.length; i++){

            if ((change / changeType[i]) != 0){
                changeCnt += (change / changeType[i]);
                change = change % changeType[i];
            }

        }

        System.out.println(changeCnt);
    }
}