// 백준 10808번 알파벳 개수 / 난이도 : 브론즈 4
// 메모리 : 15844KB, 시간 : 116ms

// 문제
// 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각 알파벳이 단어에 몇 개가 포함되어 있는지 구하는 프로그램을 작성하시오.

// 입력
// 첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.

// 출력
// 단어에 포함되어 있는 a의 개수, b의 개수, …, z의 개수를 공백으로 구분해서 출력한다.

package algorithmTest_20241018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjun10808 {
    public static void main(String[] args) throws IOException {

       // 단어 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        int[] cunArr = new int[26];

        for(int i = 0; i < word.length() ; i++){
            cunArr[word.charAt(i) - 97]++;
        }

        for(int i = 0; i < 26; i++){
            System.out.print(cunArr[i] + " ");
        }

    }
}
