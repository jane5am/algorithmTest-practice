// 5가 들어갔을 때 i= 1
//              j는 2~5까지 반복 4번
//               i=2
//              j는 3~5까지 반복 3번
// 이런식으로 j는 4+3+2+1= 10
// 7이 들어가면 두번째 포문이
// 6+5+4+3+2+1

package algorithmTest_20240531.알고리즘수업_알고리즘의수행시간4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjun24265 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String num = bf.readLine();
        Long num2 = Long.parseLong(num);
        bf.close();

        System.out.println(num2* (num2 - 1) / 2);
        System.out.println(2);

    }
}
