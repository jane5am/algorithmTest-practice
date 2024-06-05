// 백준 12605번, 난이도 브론즈2
// 메모리 18164KB, 시간 220ms
// 1. 행 갯수 N 입력받기
// 2. stack.push 이용해서 단어를 담는다
// 3. for문 이용해서 Case #x 반복출력
// 4. stack.pop 이용해서 글자 지우면서 출력

package algorithmTest_20240605.단어순서뒤집기;

import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class baekjun12605 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<>();

        // 1. 행 갯수 N 입력받기
        int N = sc.nextInt();
        String sentence; // 문장
        sc.nextLine(); // 개행 버리기

        // 2. stack.push 이용해서 글자를 담는다
        for(int i = 1; i < N+1 ; i++){ // i는 1부터 시작 Case 숫자 세는 용도
            sentence = sc.nextLine();
            StringTokenizer st = new StringTokenizer(sentence);

            while (st.hasMoreTokens()){
                stack.push(st.nextToken());
            }

            System.out.print("Case #"+ i +": ");

            while(!stack.isEmpty()){
                System.out.print(stack.pop() + " ");
            }

        }


    }
}
