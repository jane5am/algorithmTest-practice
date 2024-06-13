// 백준 11382번 꼬마 정민, 난이도 : 브론즈 5
// 메모리 14180KB, 시간 : 120ms
package algorithmTest_20240613;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjun11382 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long num1 = Long.parseLong(st.nextToken());
        long num2 = Long.parseLong(st.nextToken());
        long num3 = Long.parseLong(st.nextToken());

        System.out.println(num1 + num2 + num3);
    }
}
