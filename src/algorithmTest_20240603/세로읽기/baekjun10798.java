// 메모리 17644KB, 시간 204ms
// 1. 5줄 값 입력 받아서 이중배열에 넣기
// 2. 이중for문으로 [0][0] > [1][0] > [2],[0] ... > [4],[0] 순서대로 출력
package algorithmTest_20240603.세로읽기;

import java.util.Scanner;

public class baekjun10798 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[][] arr = new char[5][15]; // 이중 배열 생성
        int row = arr.length; // 행의 길이
        int col = arr[0].length; // 열의 길이


        // 1. 5줄 값 입력 받아서 이중배열에 넣기
        for (int i = 0; i < row; i++) {
            String word = sc.next();
            for (int j = 0; j < word.length(); j++) {
                arr[i][j] = word.charAt(j);
            }
        }

        // 2. 이중for문으로 [0][0] > [1][0] > [2],[0] ... > [4],[0] 순서대로 출력
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if( arr[j][i] == 0 ){
                    continue;
                }
                System.out.print(arr[j][i]);
            }

        }

    }
}
