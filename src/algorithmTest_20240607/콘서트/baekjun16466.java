// 백준 16466번 콘서트 , 난이도 : 브론즈 1
// 메모리 159036KB, 시간 636ms
// 1. 1차티켓팅에서 팔린 티켓 갯수 입력받기
// 2. 1차 티켓 번호 입력받기
// 3. 1부터 1씩올려서 set에 없는 값 추출

package algorithmTest_20240607.콘서트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.HashSet;
import java.util.StringTokenizer;

public class baekjun16466 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. 1차티켓팅에서 팔린 티켓 갯수 입력받기
        int num = Integer.parseInt(br.readLine());
        HashSet<Integer> set = new HashSet<>();

        // 2. 1차 티켓 번호 입력받기
        String ticketNum = br.readLine();
        StringTokenizer st = new StringTokenizer(ticketNum);

        for(int i = 0; i < num; i++){
            int temp = Integer.parseInt(st.nextToken());
            set.add(temp);
        };

        // 4. 1부터 1씩올려서 리스트에 없는 값 추출
        for(int i = 1; ; i++){
            if (!set.contains(i)) {
                System.out.println(i);
                break;
            }

        }

    }
}
