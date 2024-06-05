// 메모리 20324KB, 시간 264ms
// 1. 방의 크기 N 입력받기
// 2. [N][N] 크기의 이중배열 생성
// 3. 입력값 이중배열에 넣기 > 이중for문 사용
// 4. 가로 누울자리 갯수 구하기
//    [0][0]부터 오른쪽으로 돌면서 누울수있는 자리 cnt++
//    cnt가 2이상되면 가로 누울자리 +1
//    짐을 만나거나 다음줄 내려가면 cnt비우기
// 5. 세로도 반복해서 세로 누울자리 구하기

package algorithmTest_20240603.누울자리를찾아라;

import java.util.Scanner;

public class baekjun1652 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //1. 방의 크기 N 입력받기
        int N = sc.nextInt(); // 방의 크기
        int cnt = 0; // 누울 자리 카운트
        int widthSeat = 0; // 가로 누울 자리
        int lengthSeat =0;  // 세로 누울 자리

        //2. [N][N] 크기의 이중배열 생성
        char [][] room = new char[N][N];

        // 3. 입력값 이중배열에 넣기 > 이중for문 사용
        for (int i = 0; i < N ; i++){
            String row = sc.next();
            for(int j = 0; j < N ; j++){
                room[i][j] = row.charAt(j);
            }
        }

        // 4. 가로 누울자리 갯수 구하기
        //   [0][0]부터 오른쪽으로 돌면서 누울수있는 자리 cnt++
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N ; j++) {
                if( room[i][j] == '.'){
                    cnt++;
                }else {
                    if(cnt >= 2){  // cnt가 2이상되면 가로 누울자리 +1
                        widthSeat++;

                    }
                    cnt = 0;  // 짐을 만나면 cnt 비우기
                }
            }

            if(cnt >= 2){ // cnt가 2이상되면 가로 누울자리 +1
                widthSeat++;

            }
            cnt = 0; // 다음줄 내려가면 cnt비우기

        }

        // 5. 세로 누울자리 갯수 구하기
        //   [0][0]부터 오른쪽으로 돌면서 누울수있는 자리 cnt++
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N ; j++) {
                if( room[j][i] == '.'){
                    cnt++;
                } else{
                    if(cnt >= 2){  // cnt가 2이상되면 가로 누울자리 +1
                        lengthSeat++;

                    }
                    cnt = 0;  // 짐을 만나면 cnt 비우기
                }
            }

            if(cnt >= 2){ // cnt가 2이상되면 가로 누울자리 +1
                lengthSeat++;
            }
            cnt = 0; // 다음줄 내려가면 cnt비우기
        }

        System.out.print(widthSeat + " " + lengthSeat);

    }
}
