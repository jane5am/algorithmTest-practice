// 백준 2444번 별 찍기 - 7 / 난이도 : 브론즈 3
// 메모리 : 22468 KB, 시간 : 360 ms

// 문제
// 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.

// 입력
// 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

// 출력
// 첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.

package algorithmTest_20241114;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjun2444 {
    public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       int num = Integer.parseInt(br.readLine());

       for( int i = 1; i <= num; i++) {
           for (int j = num - i; j > 0; j--) {
               System.out.print(" ");
           }
           for (int k = 0; k < (i * 2 - 1); k++) {
               System.out.print("*");
           }

           System.out.println();
       }

       for( int i = num-1; i >= 1; i--){
           for(int j = 0; j < num - i; j++ ){
               System.out.print(" ");
           }
           for(int k = ( i * 2 - 1 ); k > 0 ; k-- ){
               System.out.print("*");
           }

           System.out.println();
       }
    }
}