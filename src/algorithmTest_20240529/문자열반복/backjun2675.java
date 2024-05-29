// 숫자와 문자열 입력값 저장
// 문자열을 한글자씩 불러와서 숫자입력값만큼 반복 = a
// a를 문자의 길이 만큼 반복

package algorithmTest_20240529.문자열반복;

import java.util.Scanner;

public class backjun2675 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int repeatNum = sc.nextInt();

        for( int i = 0; i < repeatNum; i++ ) {

            int num = sc.nextInt();
            String letter = sc.next();

            for(int j = 0; j < letter.length(); j++) {
                for( int k = 0; k < num; k++) {
                    System.out.print(letter.charAt(j));
                }
            }
            System.out.println();
        }

    }
}
