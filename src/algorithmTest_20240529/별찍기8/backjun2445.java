// 행의 갯수는 (입력값*2)-1
// 열을 하나 완성 할때 *과 공백을 입력하기위한 for문이 2개 필요하다
// *찍는 for문 안에 공백 for문이 포함
// *찍는 갯수는 1부터 1씩증가하다가 5에서 다시 1씩감소
// 공백 찍는 갯수는 8개에서 2개씩 감소 >

package algorithmTest_20240529.별찍기8;

import java.util.Scanner;

public class backjun2445 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int row = 1; row <= (num*2)-1; row++) {//열
            if( row <=num ){
                for(int col = 1; col <= row; col++) {
                    System.out.print("*");
                }
                for( int i = (num*2- (row * 2)); i > 0 ; i--  ) {
                    System.out.print("-");
                }
                for(int col = 1; col <= row; col++) {
                    System.out.print("*");
                }
            } else { // row 가 6,7,8,9 / col =4,3,2,1 / i가 2,4,6,8            row+col = 10 /10
                int stars = (num * 2) - row;
                for (int col = 1; col <= stars; col++) {
                    System.out.print("*");
                }
                for (int i = (row * 2 - num * 2); i > 0; i--) {
                    System.out.print("-");
                }
                for (int col = 1; col <= stars; col++) {
                    System.out.print("*");
                }
            }

            System.out.println();

        }
    }
}
