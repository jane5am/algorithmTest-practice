// 두 수 입력받기
// 두 수 앞뒤바꾸기
// 두 수 비교
// 비교해서 큰 값 출력하기

package algorithmTest_20240530.상수;

import java.util.Scanner;

public class backjun2908 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String num1 = sc.next();
        String num2 = sc.next();

        char[] newNum1 = new char[3];
        char[] newNum2 = new char[3];

        for(int i = 2, j=0; i >= 0 ; i--, j++ ){
            newNum1[j] = num1.charAt(i);
            newNum2[j] = num2.charAt(i);
        }

        String strNum1 = new String(newNum1);
        String strNum2 = new String(newNum2);

        int intNum1 = Integer.parseInt(strNum1);
        int intNum2 = Integer.parseInt(strNum2);

        System.out.println(Math.max(intNum1,intNum2));

    }
}
