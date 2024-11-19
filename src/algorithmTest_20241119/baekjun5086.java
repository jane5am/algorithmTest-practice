// 백준 2566번 배수와 약수 / 난이도 : 브론즈 3
// 메모리 : 13984   KB, 시간 : 100 ms

// 문제
// 4 × 3 = 12이다.
// 이 식을 통해 다음과 같은 사실을 알 수 있다.
// 3은 12의 약수이고, 12는 3의 배수이다.
// 4도 12의 약수이고, 12는 4의 배수이다.
// 두 수가 주어졌을 때, 다음 3가지 중 어떤 관계인지 구하는 프로그램을 작성하시오.
// 첫 번째 숫자가 두 번째 숫자의 약수이다.
// 첫 번째 숫자가 두 번째 숫자의 배수이다.
// 첫 번째 숫자가 두 번째 숫자의 약수와 배수 모두 아니다.

// 입력
// 입력은 여러 테스트 케이스로 이루어져 있다.
// 각 테스트 케이스는 10,000이 넘지않는 두 자연수로 이루어져 있다. 마지막 줄에는 0이 2개 주어진다. 두 수가 같은 경우는 없다.

// 출력
// 각 테스트 케이스마다 첫 번째 숫자가 두 번째 숫자의 약수라면 factor를, 배수라면 multiple을, 둘 다 아니라면 neither를 출력한다
package algorithmTest_20241119;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class baekjun5086 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String temp;
        String[] stringTemp;
        while (   !( temp = br.readLine() ).equals("0 0") ){
            stringTemp = temp.split(" ");
            int num1 = Integer.parseInt(stringTemp[0]);
            int num2 = Integer.parseInt(stringTemp[1]);

            if( ( num2 % num1 ) == 0 ){
                sb.append("factor").append("\n");
            } else if ( (num1 % num2) == 0) {
                sb.append("multiple").append("\n");
            } else {
                sb.append("neither").append("\n");
            }
        }

        System.out.println(sb);
    }
}