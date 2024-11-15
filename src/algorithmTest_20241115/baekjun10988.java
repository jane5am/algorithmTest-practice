// 백준 10988번 팰린드롬인지 확인하기 / 난이도 : 브론즈 3
// 메모리 : 14464 KB, 시간 : 104 ms

// 문제
// 알파벳 소문자로만 이루어진 단어가 주어진다. 이때, 이 단어가 팰린드롬인지 아닌지 확인하는 프로그램을 작성하시오.
// 팰린드롬이란 앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어를 말한다.
// level, noon은 팰린드롬이고, baekjoon, online, judge는 팰린드롬이 아니다.

// 입력
// 첫째 줄에 단어가 주어진다. 단어의 길이는 1보다 크거나 같고, 100보다 작거나 같으며, 알파벳 소문자로만 이루어져 있다.

// 출력
// 첫째 줄에 팰린드롬이면 1, 아니면 0을 출력한다.

package algorithmTest_20241115;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Objects;

public class baekjun10988 {
    public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       String[] word = br.readLine().split("");
       int answer = 1;

       for( int i = 0, j = word.length-1; i <= word.length/2 ; i++, j-- ){
           if( !(word[i].equals(word[j])) ){
               answer = 0;
               break;
           }
       }

        System.out.println(answer);
    }
}