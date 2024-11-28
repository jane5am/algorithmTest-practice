// 백준 5622번 다이얼 / 난이도 : 브론즈 2
// 메모리 : 14220 KB, 시간 : 100 ms

// 문제
// 상근이의 할머니는 아래 그림과 같이 오래된 다이얼 전화기를 사용한다.
// 전화를 걸고 싶은 번호가 있다면, 숫자를 하나를 누른 다음에 금속 핀이 있는 곳 까지 시계방향으로 돌려야 한다.
// 숫자를 하나 누르면 다이얼이 처음 위치로 돌아가고, 다음 숫자를 누르려면 다이얼을 처음 위치에서 다시 돌려야 한다.
// 숫자 1을 걸려면 총 2초가 필요하다. 1보다 큰 수를 거는데 걸리는 시간은 이보다 더 걸리며, 한 칸 옆에 있는 숫자를 걸기 위해선 1초씩 더 걸린다.
// 상근이의 할머니는 전화 번호를 각 숫자에 해당하는 문자로 외운다. 즉, 어떤 단어를 걸 때, 각 알파벳에 해당하는 숫자를 걸면 된다.
// 예를 들어, UNUCIC는 868242와 같다.
// 할머니가 외운 단어가 주어졌을 때, 이 전화를 걸기 위해서 필요한 최소 시간을 구하는 프로그램을 작성하시오.

// 입력
// 첫째 줄에 알파벳 대문자로 이루어진 단어가 주어진다. 단어의 길이는 2보다 크거나 같고, 15보다 작거나 같다.

// 출력
// 첫째 줄에 다이얼을 걸기 위해서 필요한 최소 시간을 출력한다.

package algorithmTest_20241128;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baekjun5622 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word= br.readLine();
        int[] english = new int[27]; // A~Z, 인덱스 1~26까지 0은 안써서 총 27
        for ( int i = 0; i < word.length(); i++ ){
            int num = (int)word.charAt(i) - 64;
            english[num]++; // 각 알파벳의 인덱스에 카운트
        }

        int cnt = 0;
        for( int i = 1; i < english.length; i++){
            if ( english[i] == 0){
                continue;
            }

            if ( i == 1 || i == 2 || i == 3){
                cnt = cnt + (3 * english[i]) ;
            } else if (i == 4 || i == 5 || i == 6) {
                cnt = cnt + (4 * english[i]);
            } else if (i == 7 || i == 8 || i == 9) {
                cnt = cnt + (5 * english[i]);
            } else if (i == 10 || i == 11 || i == 12) {
                cnt = cnt + (6 * english[i]);
            } else if (i == 13 || i == 14 || i == 15) {
                cnt = cnt + (7 * english[i]);
            } else if (i == 16 || i == 17 || i == 18 || i == 19) {
                cnt = cnt + (8 * english[i]);
            } else if( i == 20 || i == 21 || i == 22 ){
                cnt = cnt + (9 * english[i]);
            } else{
                cnt = cnt + (10 * english[i]);
            }
        }

        System.out.print(cnt);
    }
}