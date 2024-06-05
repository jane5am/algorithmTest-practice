// 백준 17608번, 난이도 브론즈2
// 메모리 113720KB, 시간 982ms
// 1. 막대기의 갯수 N 입력받기
// 2. 막대기의 높이 입력받기 - for문으로 stack사용
// 3. stack에서 하나씩 꺼내면서 기존값보다 큰 값찾기
// 4. 큰값을 계속바꿔주면서 카운트 세기
package algorithmTest_20240605.막대기;

import java.util.Scanner;
import java.util.Stack;

public class baekjun17608 {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int cnt = 0; // 보이는 막대기 갯수
        int max = 0;
        // 1. 막대기의 갯수 N 입력받기
        int N = sc.nextInt();

        // 2. 막대기의 높이 입력받기 - for문으로 stack사용
        for( int i = 0; i < N ; i++ ){
            stack.push(sc.nextInt());
        }

        int temp = 0; //stack꺼낸 값 임시저장
        // 3. stack에서 하나씩 꺼내면서 기존값보다 큰 값찾기
        for(int i = 0; i < N ; i++){
            temp = stack.peek();
            if (stack.pop() > max ){
                max = temp;
                cnt++; // 4. 큰값을 계속바꿔주면서 카운트 세기
            }
        }

        System.out.println(cnt);

    }
}
