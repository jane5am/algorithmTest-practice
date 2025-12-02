// 백준 1157번 단어 공부 / 난이도 : 브론즈 2
// 메모리 : 87204	KB, 시간 : 440 ms

// 문제
// 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
// 단, 대문자와 소문자를 구분하지 않는다.

// 입력
// 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.

// 출력
// 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.

package algorithmTest_20251202;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjun1157 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] word = br.readLine().toUpperCase().split("");

        int[] alphabetArr = new int[26];

        for(int i = 0; i < word.length; i++) {
            int a = word[i].charAt(0);
            int arrNum = a - 65;

            alphabetArr[arrNum]++;
        }

        int max = alphabetArr[0];
        int countMax = 0;
        int alphabetNum = 0;
        for(int i = 1; i < alphabetArr.length; i++) {
            if( max < alphabetArr[i] ){
                max = alphabetArr[i];
                countMax = 0;
                alphabetNum = i;
            } else if( max == alphabetArr[i] && max != 0 ){
                countMax++;
            }
        }

        if(countMax > 0){
            System.out.print("?");
        }else{
            System.out.print((char)(alphabetNum + 65));

        }

    }
}