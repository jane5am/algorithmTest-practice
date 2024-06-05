// 1. 두 정수 입력받기
// 2. if 이용해서 두 수 비교해주기

package algorithmTest_20240603;

import java.util.Scanner;
import java.util.StringTokenizer;

public class backjun1330 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. 두 정수 입력받기
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if( num1 > num2){
            System.out.println(">");
        }else if(num1 < num2) {
            System.out.println("<");
        }else {
            System.out.println("==");
        }

    }
}
