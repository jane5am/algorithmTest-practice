// 백준 10952번 A+B - 5 , 난이도 : 브론즈 5
// 메모리 14180KB, 시간 128ms
// 1. A의 값에 0이 들어올때까지 while문을 돌면서 숫자를 입력받는다
// 2. 입력받은 숫자는 StringTokenizer로 잘라서 저장
// 3. nextToken() 해서 두값 합쳐서 출력
package algotithmTest_20240608;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjun10952 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 1. A의 값에 0이 들어올때까지 while문을 돌면서 숫자를 입력받는다
        String line;
        while( true ){
            line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            if( num1 == 0 ) {
                break;
            }
            sb.append(num1+num2).append("\n");// sb.append((num1+num2)+"\n")

        }

        System.out.println(sb);
    }

}
