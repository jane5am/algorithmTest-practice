// 백준 28417번 스케이트보드, 난이도 브론즈3
// 메모리 70076KB, 시간 548ms
// 1. 사람 수 N 입력받기
// 2. 점수 입력받아서 앞에 두개 비교해서 MAX1, 나머지 점수 비교해서 MAX2
// 3. MAX1+ MAX2값 출력
package algorithmTest_20240609.스케이트보드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class baekjun28417 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int userNum = Integer.parseInt(br.readLine()); // 사람수

        int winScore = 0;
        int[] track = new int[5];

        for(int i = 0; i < userNum; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int run1 = Integer.parseInt(st.nextToken());
            int run2 = Integer.parseInt(st.nextToken());

            int runMax = Math.max(run1, run2); // run 점수 최고값 구하기


            for(int j = 0; j < 5; j++){ // track 점수 배열에 넣기
                track[j] = Integer.parseInt(st.nextToken());
            }

            // Track 최고값 두 개 찾기
            int firstMax = 0;
            int secondMax = 0;

            for (int j = 0; j < 5; j++) {
                if (track[j] > firstMax) {
                    secondMax = firstMax;
                    firstMax = track[j];
                } else if (track[j] > secondMax) {
                    secondMax = track[j];
                }
            }

            int maxScore = runMax + firstMax + secondMax;

            if(winScore < maxScore){
                winScore = maxScore;
            }
        }

        System.out.println(winScore);

    }
}
