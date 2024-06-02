// 1. 반복횟수 입력 받아서 단어 담을 배열에 하나씩 넣기
// 2. 후보단어 반복횟수 입력 받아서 후보 단어 담을 배열에 하나씩 넣기
// 3. ?가 몇번째 배열에 있는지 확인
// 4. ?인덱스 앞 배열의 맨 뒷글자, ?인덱스 뒤 배열의 맨 앞글자 확인
// 5. 후보단어 중 찾은 맨뒷글자로 시작하고, 찾은 맨 앞글자로 끝나는 단어 찾기 - 반복문 이용
// 6. 단어와 후보단어의 중복값있으면 제거

package algorithmTest_20240601.끝말잇기;

import java.io.*;
import java.util.*;

public class baekjun28432 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(); // 반복횟수
        String[] word = new String[num]; // 단어 담을 배열

        for (int i = 0; i < num; i++) {
           word[i] = sc.next();
        }

        int canNum = sc.nextInt(); // 후보 단어 갯수
        String[] canWord = new String[canNum]; // 후보 단어 담을 배열

        for (int i = 0; i < canNum; i++){
            canWord[i] = sc.next();
        }


        // ?가 몇번째 인덱스에 있는지 찾아서 담을 변수
        int index = 0;

        // 3. ?가 몇번째 배열에 있는지 확인
        for(int i = 0 ; i < word.length ; i++){
            if( word[i].equals("?")){
                index = i;
                break;
            }
        }

        // 4-1. ?인덱스 앞 배열의 맨 뒷글자 확인
        char[] beforeWord = word[index-1].toCharArray();
        char beforeWordChar = beforeWord[beforeWord.length-1];

        // 4-2. ?인덱스 뒤 배열의 맨 앞글자 확인
        char[] nextCharArray = word[index+1].toCharArray();
        char nextWordChar = nextCharArray[0];

        // 5. 후보단어 중 찾은 맨뒷글자로 시작하고, 찾은 맨 앞글자로 끝나는 단어 찾기 - 반복문 이용
        for(int i = 0 ; i < canWord.length ; i++){
            if( beforeWordChar == canWord[i].charAt(0)){
                if ( nextWordChar == canWord[i].charAt(canWord[i].length()-1)){
                    System.out.println(canWord[i]);
                    break;
                }
            }

        }

    }
}
