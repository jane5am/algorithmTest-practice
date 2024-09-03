// 백준 2743번 킹, 퀸, 룩, 비숍, 나이트, 폰 / 난이도 : 브론즈 5
// 메모리 : 14292KB, 시간 : 100ms

// 문제
// 동혁이는 오래된 창고를 뒤지다가 낡은 체스판과 피스를 발견했다.
// 체스판의 먼지를 털어내고 걸레로 닦으니 그럭저럭 쓸만한 체스판이 되었다. 하지만, 검정색 피스는 모두 있었으나, 흰색 피스는 개수가 올바르지 않았다.
// 체스는 총 16개의 피스를 사용하며, 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다.
// 동혁이가 발견한 흰색 피스의 개수가 주어졌을 때, 몇 개를 더하거나 빼야 올바른 세트가 되는지 구하는 프로그램을 작성하시오.

// 입력
// 첫째 줄에 동혁이가 찾은 흰색 킹, 퀸, 룩, 비숍, 나이트, 폰의 개수가 주어진다. 이 값은 0보다 크거나 같고 10보다 작거나 같은 정수이다.
package algorithmTest_20240904;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjun3003 {
    public static void main(String[] args) throws IOException {

        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] piece = {1, 1, 2, 2, 2, 8}; // 기존 체스말(되어야하는 것)

        String str = br.readLine(); // 입력받는 체스말
        String[] pieceStr = str.split(" ");
        int[] ourPiece = new int[6];

        for(int i = 0; i < piece.length; i++){
            ourPiece[i] = Integer.parseInt(pieceStr[i]);
            sb.append( piece[i] - ourPiece[i]).append(" ");
        }

        System.out.println(sb);
    }
}
