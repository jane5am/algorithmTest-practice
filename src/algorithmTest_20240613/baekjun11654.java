// 백준 11654번 아스키 코드, 난이도 : 브론즈 5
// 메모리 : 14200KB, 시간 :124ms
package algorithmTest_20240613;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjun11654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char word = br.readLine().charAt(0);
        int realWord = word;
        System.out.println(realWord);
    }
}
