// 백준 14720번 우유 축제 , 난이도 : 브론즈 2
// 입맛이 매우 까다로운 영학이는 자신만의 우유를 마시는 규칙이 있다.
// 메모리 14504KB, 시간 128ms
// 1. 우유 가게 수 입력받기
// 2. 우유 가게 정보 입력 받기
// 3. cnt를 하나 놓고 0이 들어오면 ++하고 그 카운트랑 같으면 또 ++하고, 2일때는 0을 보면 초기화시킨다
// 4. 숫자가 바뀔 때마다 카운트한다
package algorithmTest_20240614.우유축제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjun14720 {
    public static void main(String[] args) throws IOException {

        // 1. 우유 가게 수 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int cnt = 0; //우유 마신 횟수

        // 2. 우유 가게 정보 입력 받기
        String[] arr = br.readLine().split(" ");
        int[] milk = new int[num]; // 우유 종류 저장

        for (int i = 0; i < num; i++) {
            milk[i] = Integer.parseInt(arr[i]);
        }
        int milkNum = 0;

        // 3. cnt를 하나 놓고 0이 들어오면 ++하고 그 카운트랑 같으면 또 ++하고, 2일때는 0을 보면 초기화시킨다
        for(int i = 0; i < milk.length; i++){
            if(milk[i] == milkNum ){
                if( milkNum == 2){
                    cnt++;
                    milkNum = 0;
                    continue;
                }
                cnt++; // 우유 마심
                milkNum++;
            }
        }

        System.out.println(cnt);

    }
}
