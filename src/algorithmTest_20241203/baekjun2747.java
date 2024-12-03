// 백준 2747번 피보나치 수 / 난이도 : 브론즈 2
// 메모리 : 14164	KB, 시간 : 104 ms

// 문제
// 피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다.
// 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.
// 이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n ≥ 2)가 된다.
// n=17일때 까지 피보나치 수를 써보면 다음과 같다.
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
// n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.

// 입력
// 도현이는 입력으로 주어진 순서대로 바구니의 순서를 바꾼다.

// 출력
// 첫째 줄에 n번째 피보나치 수를 출력한다.

package algorithmTest_20241203;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjun2747 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        if ( num == 0 ){
            System.out.print(0);
            return;
        } else if ( num == 1 ) {
            System.out.print(1);
            return;
        }

        long num1 = 0;
        long num2 = 1;
        long sum = 0;

        for ( int i = 0; i <= (num-2); i++ ){
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }

        System.out.println(sum);

    }
}