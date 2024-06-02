// 1. 수 N과 진법 B를 입력받는다
// 2. MAP 생성
package algorithmTest_20240601.진법변환;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class baekjun2745 {
    public static void main(String[] args) throws IOException {
        int sum = 0;

        //1. 수 N과 진법 B를 입력받는다
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sen = br.readLine();
        String N = sen.split(" ")[0];
        int B = Integer.parseInt(sen.split(" ")[1]);
//        System.out.println(N);
//        System.out.println(B);

        //2. MAP 생성
        HashMap<Integer, Character> map = new HashMap<>();
        for (int i = 0; i < B; i++) {
            if( i <= 9 ){
                map.put(i,  (char) (i + '0') ); // 숫자 0~9 넣음, 숫자를 문자로 변환

            }else {
                map.put(i, (char) ('A'+ (i-10))); // 맵의 key값이 10이상일 때 A부터 Z까지
            }
        }

        // 수N이 몇자리 수인지 확인
        int nLength = N.length();

        for (int i = (nLength-1), j = 0 ; i > -1; i-- , j++) {

            int finalI = i;
            // value로 key값 가져오기
            List<Integer> keys = map.entrySet().stream()
                    .filter(entry -> Objects.equals(entry.getValue(), N.charAt(finalI)))
                    .map(Map.Entry::getKey)
                    .collect(Collectors.toList());

            //가져온 key값은 result로 저장
            int result = keys.get(0);

//            System.out.println("i : " + i + ", j : " + j + ", result : " + result);
//            System.out.println(result * Math.pow(B,j));
            sum  = sum + (result * (int)Math.pow(B,j));


        }

        System.out.println(sum);
    }
}
