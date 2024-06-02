// 곱셈
// 1. 세 자리 자연수 2개를 입력받기 > num1 , num2
// 2. (num2 1의 자리 * num1 1의자리) + ( num2 1의 자리 * num1 10의자리 *10) + ( num2의 1의자리 * num1의 100의 자리 *100)
// 3. 2번과정의 num2 10의 자리/ 100의 자리도 동일하게 반복
// 4. 모든 값을 합쳐주기

package algorithmTest_20240602;

import java.util.Scanner;

public class backjun2588 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1. 세 자리 자연수 2개 입력 받기
        String num1 = sc.next();
        String num2 = sc.next();

        int[] sum = new int[3]; // 계산한 곱셈값의 합
        int finalSum = 0; // 계산한 곱셈값의 총합

        char[] num1Char = num1.toCharArray();
        char[] num2Char = num2.toCharArray();

        //숫자를 한글자씩 int로 변환
        int[] num1Int = new int[3];
        int[] num2Int = new int[3];

        for (int i = 0; i < num1Char.length; i++) {
            num1Int[i] = num1Char[i] - '0';
            num2Int[i] = num2Char[i] - '0';
        }


        // 2. (num2 1의 자리 * num1 1의자리) + ( num2 1의 자리 * num1 10의자리 *10) + ( num2의 1의자리 * num1의 100의 자리 *100)
        for( int i = 2 ; i >= 0; i--){
            for( int j = 2 , digit = 1; j >= 0; j--, digit *= 10 ){
               sum[i] = sum[i] + (num2Int[i] * num1Int[j]) * digit ;
            }
            System.out.println(sum[i]);
        }

        System.out.println(sum[0]*100 + (sum[1]*10) + sum[2] );


    }
}
