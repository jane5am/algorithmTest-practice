// 백준 10950 A+B - 3 , 난이도 : 브론즈5
// 메모리 16056KB, 시간 136ms

// 1. 테스트 케이스 갯수 T 입력받기
// 2. T 갯수만큼 for문 돌려서 테스트 케이스 입력받기
// 3. 입력받은 문장 spilt으로 잘라서 변수 num1[], num2[]에 넣기
// 4. num1 + num2 합 출력하기
package algorithmTest_20240607;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class baekjun10950_2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 갯수T

        String number; //
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        for( int i = 0; i < T; i++ ){
            number = br.readLine();
            list1.add(Integer.parseInt(number.split(" ")[0]));
            list2.add(Integer.parseInt(number.split(" ")[1]));
        }


        for( int i = 0; i < T; i++ ){
            System.out.println(list1.get(i) + list2.get(i));
        }
    }
}
