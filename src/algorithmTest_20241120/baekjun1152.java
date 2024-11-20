// 백준 1152번 단어의 개수 / 난이도 : 브론즈 2
// 메모리 : 58184 KB, 시간 : 296 ms

// 문제
// 첫 번째 숫자가 두 번째 숫자의 약수와 배수 모두 아니다.

// 입력
// 첫 줄에 영어 대소문자와 공백으로 이루어진 문자열이 주어진다.
// 이 문자열의 길이는 1,000,000을 넘지 않는다. 단어는 공백 한 개로 구분되며, 공백이 연속해서 나오는 경우는 없다.
// 또한 문자열은 공백으로 시작하거나 끝날 수 있다.

// 출력
// 첫째 줄에 단어의 개수를 출력한다.
package algorithmTest_20241120;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class baekjun1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");

        List<String> wordList = new ArrayList<>();

        for ( String a : arr){
            if ( !a.isEmpty()){
                wordList.add(a);
            }
        }

        System.out.println(wordList.size());

    }
}