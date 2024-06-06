// 백준 9933 민균이의 비밀번호 , 난이도 : 브론즈1
// 메모리 16056KB, 시간 136ms
// 1. 단어의 수 N 입력받기
// 2. for문으로 단어 입력받기
// 3. 단어를 다 뒤집고 그거랑 같은 단어가있는지 확인
package algorithmTest_20240606.민균이의비밀번호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjun9933 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 1. 단어의 수 N 입력받기
        int N = Integer.parseInt(br.readLine()); // 숫자N
        String[] word = new String[N];


        // 2. for문으로 단어 입력받기
        for (int i = 0; i < N; i++) {
            word[i] = br.readLine();

        }

        String reverseWord ;
        for( String sr : word){
            StringBuffer sb = new StringBuffer(sr);
            reverseWord = sb.reverse().toString();
            for(int i =0; i < word.length; i++){
                if(word[i].equals(reverseWord)){
                    char midChar = sr.charAt(sr.length()/2); //중간글자
                    System.out.print(sr.length()+" " + midChar);
                    return;
                }
            }

        }


    }
}
