// 백준 2752번 새수정렬 / 난이도 : 브론즈 4
// 메모리 : 16648 KB, 시간 : 132 ms

// 문제
// 동규는 세수를 하다가 정렬이 하고 싶어졌다.
//정수 세 개를 생각한 뒤에, 이를 오름차순으로 정렬하고 싶어졌다.
//정수 세 개가 주어졌을 때, 가장 작은 수, 그 다음 수, 가장 큰 수를 출력하는 프로그램을 작성하시오.

// 입력
// 정수 세 개가 주어진다. 이 수는 1보다 크거나 같고, 1,000,000보다 작거나 같다. 이 수는 모두 다르다.

// 출력
// 제일 작은 수, 그 다음 수, 제일 큰 수를 차례대로 출력한다.

package algorithmTest_20241108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjun2752 {
    public static void main(String[] args) throws IOException {

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String[] num = br.readLine().split(" ");
      int[] intNum = new int[3];
      for(int i = 0; i < 3; i++){
        intNum[i] = Integer.parseInt(num[i]);
      }

      int temp;
      for(int i = intNum.length; i > 1; i--) {
          for( int j = 0; j < i -1; j++){
              if (intNum[j] > intNum[j + 1]) {
                  temp = intNum[j];
                  intNum[j] = intNum[j + 1];
                  intNum[j + 1] = temp;
              }
          }

      }

        System.out.print( intNum[0] + " " + intNum[1] + " " + intNum[2]);

    }
}
