// 메모리 14312KB , 시간 120ms
// 1. 문자열 입력받기
// 2. 문자열을 char[]로 변환하여 한 글자씩 담기
// 3. 대문자 범위에 맞는것만 골라서 이어붙이기

package algorithmTest_20240601.KMP는왜KMP일까;

import java.io.*;

public class baekjun2902 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder  st = new StringBuilder();
        String sen = bf.readLine(); // 1. 문자열 입력받기

        char[] word = sen.toCharArray(); // 2. 문자열을 char[]로 변환하여 한 글자씩 담기

        for(int i = 0 ; i < word.length ; i++){

            if((Character.isUpperCase(word[i]))){ //char타입인 경우 대문자이면 true 반환하는 메소드 Character.isUpperCase
                st.append(word[i]); // 3. 대문자 범위에 맞는것만 골라서 이어붙이기
            }
        }

        System.out.println(st); // 대문자 출력


    }
}
