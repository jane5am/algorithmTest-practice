// 백준 7567번, 난이도 브론즈2
// 메모리 17628KB, 시간 172ms
// 1. 그릇 입력받기
// 2. 한글자식 떼어놓기
// 3. 같으면 +5, 다르면 +10
package algorithmTest_20240605.그릇;

import java.util.Scanner;

public class baekjun7567 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String bowl = sc.nextLine(); // 1.그릇 입력받기
        int score = 10 ; // 점수, 기본점수 10점

        for(int i = 0; i < bowl.length() -1 ;i++){

            if (bowl.charAt(i) == bowl.charAt(i+1)){
                score = score + 5;
            }else {
                score = score + 10;
            }

        }
        System.out.print(score);
    }
}
