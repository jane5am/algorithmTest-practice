// 백준 11022번 A+B - 8, 난이도 : 브론즈 5
// 메모리 14176KB, 시간 : 128ms
// 1. 테스트케이스 갯수 N 입력받기
// 2. StringTokenizer로 공백 자른후 가져오기

package algorithmTest_20240610;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjun11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        // 1. 테스트케이스 갯수 N 입력받기
        int N = Integer.parseInt(br.readLine());

        String[] num;
        int[] intNum = new int[2];
        for( int i = 1 ; i <= N ; i++){
            num = br.readLine().split(" ");
            intNum[0] = Integer.parseInt(num[0]);
            intNum[1] = Integer.parseInt(num[1]);
//            sb.append("Case #" +i + ": " + intNum[0] + " + " + intNum[1] + " = " + (intNum[0]+intNum[1]) + "\n");
            sb.append("Case #").append(i).append(": ").append(intNum[0]).append(" + ").append(intNum[1]).append(" = ").append(intNum[0]+intNum[1]).append("\n");
        }
        System.out.println(sb);
    }
}
