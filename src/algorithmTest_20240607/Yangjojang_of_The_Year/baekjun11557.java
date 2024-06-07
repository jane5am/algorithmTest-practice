// 백준 11557번 Yangjojang of The Year, 난이도 : 브론즈 1
// 메모리 14084KB, 시간 124ms
// 1. 테스트케이스 숫자T 입력받기
// 2. 이중 for문돌려서 학교 숫자 정수 입력받고 > 학교 이름 + 술의양 입력받기
// 3. 술의양을 기준으로 정렬
package algorithmTest_20240607.Yangjojang_of_The_Year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class baekjun11557 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<Integer, String> schoolName = new HashMap<>(); // 학교이름

        // 1. 테스트케이스 숫자T 입력받기
        int tcNum = Integer.parseInt(br.readLine());

        int schoolNum; // 학교 숫자
        String school; // 학교

        // 2. 이중 for문돌려서 학교 숫자 정수 입력받고 > 학교 이름 + 술의양 입력받기
        for (int i = 0; i < tcNum; i++) {
            schoolNum = Integer.parseInt(br.readLine());

            for(int j = 0; j < schoolNum; j++){
                school = br.readLine();
                String[] tokens = school.split(" ");

                String name = tokens[0]; // 학교 이름
                int alcoholAmount = Integer.parseInt(tokens[1]); // 술의 양

                schoolName.put(alcoholAmount, name );
            }

            // 정렬
            List<Map.Entry<Integer, String>> entries = new ArrayList<>(schoolName.entrySet());
            Collections.sort(entries, (e1, e2) -> e2.getKey().compareTo(e1.getKey()));

            // 술의 양이 가장 많은 학교 출력
            System.out.println(entries.get(0).getValue());

            schoolName.clear();
        }

    }
}
