// 백준 14681번 사분면 고르기 , 난이도 브론즈5
// 메모리 14172KB, 시간 124ms
// 1. 점 x,y 값을 입력받는다
// 2. if ( x의 값이 음수일때) > if(y도 음수일때)
// 3. else ( x 양수라는 뜻 ) > if(y 음수일때)
package algorithmTest_20240607;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjun14681 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());

        if( num1 > 0 ){
            if( num2 < 0 ){
                System.out.println(4);
                return;
            }
            System.out.println(1);
        }else {
            if( num2 < 0 ){
                System.out.println(3);
                return;
            }
            System.out.println(2);
        }

    }
}
