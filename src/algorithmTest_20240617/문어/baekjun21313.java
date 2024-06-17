// 백준 21313번 문어 난이도 : 브론즈 2
// 메모리 14180KB, 시간 120ms
// 1. 문어의 수 입력받기
// 2. 문어가 짝수인 경우 1,2 번갈아가면서 출력 - 수열 사전 중 가장 앞서는 거
// 3. 문어가 홀수인 경우 1,2 번갈아가면서 출력되다가 마지막 3 출력
package algorithmTest_20240617.문어;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjun21313 {
    public static void main(String[] args) throws IOException {

        StringBuilder sb = new StringBuilder();

        //1. 문어의 수 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        // 2. 문어가 짝수인 경우 1,2 번갈아가면서 출력 - 수열 사전 중 가장 앞서는 거
        if( num % 2 == 0 ){
            for(int i = 1; i <= num; i++){
                if(i % 2 == 0){
                    sb.append("2").append(" ");
                    continue;
                }
                sb.append("1").append(" ");
            }
        }else{// 3. 문어가 홀수인 경우 1,2 번갈아가면서 출력되다가 마지막 3 출력
            for(int i = 1; i < num; i++){
                if(i % 2 == 0){
                    sb.append("2").append(" ");
                    continue;
                }
                sb.append("1").append(" ");
            }
            sb.append("3");
        }

        System.out.println(sb);
    }

}
