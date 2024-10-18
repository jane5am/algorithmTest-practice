// 백준 10818번 최소, 최대 / 난이도 : 브론즈 3
// 메모리 : 106428 KB, 시간 : 444 ms

// 문제
// N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

// 입력
// 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다.
// 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.

// 출력
// 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.

package algorithmTest_20241018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjun10818 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] numArr= br.readLine().split(" ");

        int max = Integer.parseInt(numArr[0]);
        int min = Integer.parseInt(numArr[0]);

        for(int i = 1; i < num; i++){
            int N = Integer.parseInt(numArr[i]);
            if( N > max ){
                max = N;
            }
            if( N < min){
                min = N;
            }
        }

        System.out.println(min + " " + max);
    }
}
