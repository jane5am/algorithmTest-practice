// 백준 10951번 A+B - 4, 난이도 : 브론즈 5
// 메모리 14096KB, 시간 : 124ms
package algorithmTest_20240613;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjun10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line;

        while( (line = br.readLine()) != null ){
            StringTokenizer st = new StringTokenizer(line);

            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            sb.append(num1+num2).append("\n");

        }
        System.out.println(sb);

    }
}
