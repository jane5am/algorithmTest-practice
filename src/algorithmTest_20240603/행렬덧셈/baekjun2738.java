// 메모리 36308KB, 시간 660ms
// 1. N, M값 입력받기
// 2-1. 이중 for문으로 N만큼 돌려서 행렬 A원소 M개 받기 > int 배열
// 2-2. 이중 for문으로 M만큼 돌려서 행렬 B원소 M개 받기 > int 배열
// 3. for문으로 행렬 A,B의 값을 더하기

package algorithmTest_20240603.행렬덧셈;

import java.io.IOException;
import java.util.Scanner;

public class baekjun2738 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        // 1. N, M값 입력받기
        int row = sc.nextInt(); // 행 갯수
        int col = sc.nextInt(); // 열 갯수

        int[][] A = new int[row][col]; // A행렬
        int[][] B = new int[row][col]; // B행렬

        // 2-1. 이중 for문으로 N만큼 돌려서 행렬 A원소 M개 받기 > int 배열
        for( int i = 0; i < row; i++ ){
            for( int j = 0; j < col; j++ ){
                 A[i][j] = sc.nextInt();
            }
        }

        // 2-2. 이중 for문으로 M만큼 돌려서 행렬 B원소 M개 받기 > int 배열
        for( int i = 0; i < row; i++ ){
            for( int j = 0; j < col; j++ ){
                B[i][j] = sc.nextInt();
            }
        }

        // 3. for문으로 행렬 A,B의 값을 더하기
        for( int i = 0; i < row; i++ ){
            for( int j = 0; j < col; j++ ){
                System.out.print(A[i][j] + B[i][j] +" ");
            }
            System.out.println();
        }


    }
}