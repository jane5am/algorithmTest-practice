package algorithmTest_20240605.소수단어; /**
 * 성능 : 메모리 - 14116KB, 시간 - 120ms
 *
 * 백준 소수 단어
 * 난이도 : 브론즈
 * 분류 : 문자열 구현
 *
 * 소수란 1과 자기 자신으로만 나누어떨어지는 수를 말한다. 예를 들면 1, 2, 3, 5, 17, 101, 10007 등이 소수이다. 이 문제에서는 편의상 1도 소수로 하자.
 * 알파벳 대소문자로 이루어진 영어 단어가 하나 있을 때,
 * a를 1로, b를 2로, …, z를 26으로, A를 27로, …, Z를 52로 하여 그 합을 구한다.
 * 예를 들어 cyworld는 합을 구하면 100이 되고, abcd는 10이 된다.
 * 이와 같이 구한 수가 소수인 경우, 그 단어를 소수 단어라고 한다. 단어가 주어졌을 때,
 * 그 단어가 소수 단어인지 판별하는 프로그램을 작성하시오.
 *
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        // 숫자의 합을 받을 변수
        int num = 0;

        int range = word.length();
        for (int i = 0; i < range; i++) {
            if(Character.isUpperCase(word.charAt(i))) {
                num += word.charAt(i) - 38; // A = 65
            } else {
                num += word.charAt(i) - 96; // a = 97
            }
        }

        // 2부터 구한 수까지 나눠서, 나눠 지면 소수가 아닌 정답을 리턴
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("It is not a prime word.");
                return;
            }
        }
        System.out.println("It is a prime word.");
    }
}