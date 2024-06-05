// 백준 2739번 구구단 , 난이도 : 브론즈5
// 메모리 18520KB, 시간 236ms
// 1. N 입력받기
// 2. N * M = (N*M) 형식으로 출력

package algorithmTest_20240605;

import java.util.Scanner;

public class baekjun2739 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. N 입력받기
        int dan = sc.nextInt();

        // 2. N * M = (N*M) 형식으로 출력
        for(int i = 1; i <= 9; i++){
            System.out.println( dan +" * " + i + " = " + (dan*i));
        }
    }

}
