// 백준 2753번 윤년 , 난이도 : 브론즈5
// 메모리 17792KB, 시간 228ms
// 윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
// 1. Scanner로 연도 입력받기
// 2. if (4의 배수이면서 100의 배수가 아닐때 OR 400배수일때)
package algorithmTest_20240606;

import java.util.Scanner;

public class baekjun2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Scanner로 연도 입력받기
        int year = sc.nextInt(); // 년도

        // 2. if (4의 배수이면서 100의 배수가 아닐때 OR 400배수일때)
        if( year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("1");
        }else {
            System.out.println("0");
        }

    }

}
