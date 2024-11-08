// 백준 10101번 삼각형 외우기 / 난이도 : 브론즈 4
// 메모리 : 14288  KB, 시간 : 104  ms

// 문제
// 동창영이는 삼각형의 종류를 잘 구분하지 못한다. 따라서 프로그램을 이용해 이를 외우려고 한다.
// 삼각형의 세 각을 입력받은 다음,
// 세 각의 크기가 모두 60이면, Equilateral
// 세 각의 합이 180이고, 두 각이 같은 경우에는 Isosceles
// 세 각의 합이 180이고, 같은 각이 없는 경우에는 Scalene
// 세 각의 합이 180이 아닌 경우에는 Error
// 를 출력하는 프로그램을 작성하시오.

// 입력
// 총 3개의 줄에 걸쳐 삼각형의 각의 크기가 주어진다. 모든 정수는 0보다 크고, 180보다 작다.

// 출력
// 문제의 설명에 따라 Equilateral, Isosceles, Scalene, Error 중 하나를 출력한다.

package algorithmTest_20241108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baekjun10101 {
    public static void main(String[] args) throws IOException {

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int[] num = new int[3];

      for(int i = 0; i < 3 ; i ++){
          num[i] = Integer.parseInt(br.readLine());
      }

      if ( num[0] == 60 && num[1] == 60 && num[2] == 60  ){
          System.out.println("Equilateral");
      } else if ( (num[0] + num[1] + num[2]) != 180) {
          System.out.println("Error");
      } else if( (num[0] != num[1]) && (num[1] != num[2]) && (num[0] != num[2]) ) {
          System.out.println("Scalene");
      }else{
          System.out.println("Isosceles");
      }

    }
}
