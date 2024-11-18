// 백준 3009번 네 번째 점 / 난이도 : 브론즈 3
// 메모리 : 14216 KB, 시간 : 104 ms

// 문제
// 세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.

// 입력
// 세 점의 좌표가 한 줄에 하나씩 주어진다. 좌표는 1보다 크거나 같고, 1000보다 작거나 같은 정수이다.

// 출력
// 직사각형의 네 번째 점의 좌표를 출력한다.

package algorithmTest_20241118;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class baekjun3009 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp ;

        List<Integer> XList = new ArrayList<>();
        List<Integer> YList = new ArrayList<>();

        for ( int i = 0; i < 3; i++ ){
            temp =  br.readLine().split(" ");
            XList.add(Integer.parseInt(temp[0]));
            YList.add(Integer.parseInt(temp[1]));

        }

        // 중복이 아닌 수 찾기

        for ( int i = 0; i < XList.size()-1; i++ ){
            for ( int j = i+1; j < XList.size(); j++ ){
                if ( XList.get(i).equals( XList.get(j) ) ){
                    XList.remove(j);
                    XList.remove(i);
                    System.out.print(XList.get(0) + " ");
                    break;
                }
            }
        }

        for ( int i = 0; i < YList.size()-1; i++ ){
            for ( int j = i+1; j < YList.size(); j++ ){
                if ( YList.get(i).equals( YList.get(j) ) ){
                    YList.remove(j);
                    YList.remove(i);
                    System.out.print(YList.get(0));
                    break;
                }
            }
        }


    }
}