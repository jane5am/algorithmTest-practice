// 백준 2153번, 난이도 브론즈2
// 메모리 17524KB, 시간 200ms
// 1. 단어 입력받기
// 2. 단어 한글자씩 읽어서 숫자 더하기 - 아스키코드 이용
// 3. 합한 값을 2부터 자기자신 전까지 나누어보고 그 나머지가 0인 걸 찾아낸다
// 3. 소수인경우 아닌 경우 if로 나눠서 출력
package algorithmTest_20240605.소수단어;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class baekjun2153_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Deque<Character> deque = new LinkedList<>();

        // 1. 단어 입력받기
        String word = sc.next();
        int num; // 각 글자의 숫자
        int sum = 0; // 단어 숫자의 합
        int cnt = 0; // 소수 판별cnt


        for(int i =0 ; i < word.length(); i++){
            deque.offerFirst(word.charAt(i));
        }

        int dequeLength = deque.size();

        // 2. 단어 한글자씩 읽어서 숫자 더하기 - 아스키코드 이용
        for( int i = 0; i < dequeLength ; i++){
            if ( 'a' <= deque.peekFirst() && 'z' >= deque.peekFirst() ){
                num = deque.pollFirst() - 96;
            }else {
                num =deque.pollFirst() - 38;
            }
            sum = sum + num;
        }

        if (sum ==1 || sum == 2){ // 1과 2인 경우 무조건 소수
            System.out.println("It is a prime word.");
        }

        // 3. 합한 값을 2부터 자기자신 전까지 나누어보고 그 나머지가 0인 걸 찾아낸다
        for( int i = 2 ; i < sum; i++){
            if( sum % i == 0 ){
                System.out.println("It is not a prime word.");
                break;
            }else {
                cnt++;
            }

//            if ( cnt == sum-2 ){
//                System.out.println("It is a prime word.");
//            }
        }
        System.out.println(cnt);
        System.out.println(sum-2);
        if ( cnt == sum-2 ){
            System.out.println("It is a prime word.");
        }
    }
}
