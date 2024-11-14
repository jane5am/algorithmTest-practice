// 백준 1085번 직사각형에서 탈출 / 난이도 : 브론즈 3
// 메모리 : 14168 KB, 시간 : 104 ms

// 문제
// 한수는 지금 (x, y)에 있다.
// 직사각형은 각 변이 좌표축에 평행하고, 왼쪽 아래 꼭짓점은 (0, 0), 오른쪽 위 꼭짓점은 (w, h)에 있다.
// 직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.

// 입력
// 첫째 줄에 x, y, w, h가 주어진다.

// 출력
// 첫째 줄에 문제의 정답을 출력한다.

package algorithmTest_20241113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjun1085 {
    public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       String[] rectangle = br.readLine().split(" ");
       int[] vertex = new int[4];

       for( int i = 0; i < rectangle.length; i++){
            vertex[i] = Integer.parseInt(rectangle[i]);
       }

       int distance = Math.min(vertex[0], vertex[1]);

       for(int i = 2; i < 4; i++){
           if ( distance > vertex[i] - vertex[i-2]) {
               distance = vertex[i] - vertex[i-2];
           }
       }

        System.out.println(distance);

    }
}