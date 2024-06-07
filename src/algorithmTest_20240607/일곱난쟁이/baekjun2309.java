// 백준 2309번 일곱 난쟁이, 난이도 : 브론즈 1
// 메모리 14140KB, 시간 132ms
package algorithmTest_20240607.일곱난쟁이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class baekjun2309 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> num = new ArrayList<>();
        int sum = 0;
        int gap ; // 모든 수를 더한값에서 100을 뺀 값
        String temp;

        // 숫자 입력 받아서 list에 넣어주기
        // 삭제할 값이 있기때문에 list사용
        for (int i = 0; i < 9; i++) {
            temp = br.readLine();
            num.add(Integer.parseInt(temp)) ;
            sum = sum + num.get(i);
        }

        gap = sum - 100;
        Collections.sort(num);// 나중에 정렬하면 remove()할때 값이 틀어짐

        Loop1 :
        for (int i = 0; i < num.size(); i++) {
            for (int j = 0; j < num.size(); j++) {
                if( i != j && num.get(i) + num.get(j)  == gap){
                       num.remove(j); //j먼저 삭제해야함
                       num.remove(i);
                       break Loop1;
                }
            }
        }

        for(int i = 0; i < num.size(); i++){
            System.out.println(num.get(i));
        }
    }
}
