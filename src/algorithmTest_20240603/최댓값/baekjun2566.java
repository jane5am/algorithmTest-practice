// 메모리 18552KB, 시간 244ms
// 1. 입력 값 이중배열로 담기
// 2. [0][0] 값을 max로 지정해두고 이중for문으로 비교해서 값이 큰값을 max로 교체

package algorithmTest_20240603.최댓값;

import java.util.Scanner;

public class baekjun2566 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] A = new int[9][9]; // 행렬

        int row = A.length; //9
        int col = A[0].length; //9

        int max = 0; // 최댓값
        int rowLocation = 1; // 최댓값 행 위치
        int colLocation = 1; // 최댓값 열 위치

        // 1. 입력 값 이중배열로 담기
        // 2. [0][0] 값을 max로 지정해두고 이중for문으로 비교해서 값이 큰값을 max로 교체
        for(int i = 0; i < row ; i++) {
            for (int j = 0; j < col; j++) {
                int num = sc.nextInt();
                if( num > max){
                    max = num;
                    rowLocation = i+1;
                    colLocation = j+1;
                }
            }
        }

        System.out.println(max);
        System.out.println(rowLocation + " " + colLocation);


    }


}
