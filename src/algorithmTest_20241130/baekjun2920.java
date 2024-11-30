// 백준 2920 음계 / 난이도 : 브론즈 2
// 메모리 : 14104 KB, 시간 : 104 ms

// 문제
// 다장조는 c d e f g a b C, 총 8개 음으로 이루어져있다.
// 이 문제에서 8개 음은 다음과 같이 숫자로 바꾸어 표현한다. c는 1로, d는 2로, ..., C를 8로 바꾼다.
// 1부터 8까지 차례대로 연주한다면 ascending, 8부터 1까지 차례대로 연주한다면 descending, 둘 다 아니라면 mixed 이다.
// 연주한 순서가 주어졌을 때, 이것이 ascending인지, descending인지, 아니면 mixed인지 판별하는 프로그램을 작성하시오.

// 입력
// 첫째 줄에 8개 숫자가 주어진다. 이 숫자는 문제 설명에서 설명한 음이며, 1부터 8까지 숫자가 한 번씩 등장한다.

// 출력
// 첫째 줄에 ascending, descending, mixed 중 하나를 출력한다.

package algorithmTest_20241130;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjun2920 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] temp = br.readLine().split(" ");
        int[] numArr = new int[temp.length];

        for( int i = 0; i < temp.length; i++ ){
            numArr[i] = Integer.parseInt(temp[i]);
        }

        int previousNum = numArr[0];
        if ( previousNum == 1 ){
            for( int i = 1; i < numArr.length; i++ ){
                if( (previousNum + 1) == numArr[i] ){
                    previousNum = numArr[i];
                }else{
                    System.out.print("mixed");
                    return;
                }
            }

            System.out.print("ascending");

        } else if ( previousNum == 8 ) {
            for( int i = 1; i < numArr.length; i++ ){
                if( (previousNum - 1 ) == numArr[i] ){
                    previousNum = numArr[i];
                }else{
                    System.out.print("mixed");
                    return;
                }
            }
            System.out.print("descending");

        }else {
            System.out.print("mixed");
        }

    }
}