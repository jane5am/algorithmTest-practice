// 백준 2741번 N 찍기 , 난이도 브론즈 5
// 메모리 18252KB, 시간 184ms
// 1. 자연수 N입력 받기
// 2. 1~N까지 출력하기
package algotithmTest_20240608;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjun2741 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int intNum = Integer.parseInt(br.readLine());

        for(int i = 1; i <= intNum; i++){
            sb.append(i).append("\n");
        }
        System.out.println(sb);

    }
}
