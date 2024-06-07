// 백준 10950 A+B - 3 , 난이도 : 브론즈5
// 메모리 14280KB, 시간 132ms

// 1. 테스트 케이스 갯수 T 입력받기
// 2. T 갯수만큼 for문 돌려서 테스트 케이스 입력받기
// 3. 입력받은 문장 spilt으로 잘라서 변수 num1[], num2[]에 넣기
// 4. num1 + num2 합 출력하기
package algorithmTest_20240607;

import java.io.*;

public class baekjun10950 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine()); // 테스트 갯수T

        String number; //
        int[] num1 = new int[T];
        int[] num2 = new int[T];

        for( int i = 0; i < T; i++ ){
            number = br.readLine();
            num1[i] = Integer.parseInt(number.split(" ")[0]);
            num2[i] = Integer.parseInt(number.split(" ")[1]);
        }
        String sum ;
        for( int i = 0; i < T; i++ ){
            sum = String.valueOf(num1[i]+ num2[i]);
            bw.write(sum+"\n");
        }

        bw.flush();
        // 스트림 닫기
        bw.close();
        br.close();
    }
}
