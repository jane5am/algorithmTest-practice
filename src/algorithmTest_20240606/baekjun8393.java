// 백준 8393 합, 난이도 : 브론즈5
// 메모리 17560KB, 시간 204ms
// 1.scanner로 n입력받기
// 2. for문으로 0~n까지 돌려서 더하기

package algorithmTest_20240606;

import java.util.Scanner;

public class baekjun8393 {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
        // 1.scanner로 n입력받기
        int n = sc.nextInt(); // 숫자n
        int sum = 0; // 합계

        // 2. for문으로 0~n까지 돌려서 더하기
        for( int i = 1; i <= n; i++ ){
            sum += i;
        }
        System.out.println(sum);
    }

}
