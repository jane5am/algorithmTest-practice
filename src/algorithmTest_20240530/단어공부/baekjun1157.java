package algorithmTest_20240530.단어공부;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class baekjun1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        word = word.toUpperCase();

        HashMap<Character, Integer> map = new HashMap<>();

        // 문자열의 각 문자의 빈도수를 HashMap에 저장
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // 최댓값과 최댓값을 가진 문자의 수를 찾음
        int maxCount = 0;
        char maxChar = '?';
        boolean isDuplicate = false;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            if (count > maxCount) {
                maxCount = count;
                maxChar = entry.getKey();
                isDuplicate = false;
            } else if (count == maxCount) {
                isDuplicate = true;
            }
        }

        // 결과 출력
        if (isDuplicate) {
            System.out.println("?");
        } else {
            System.out.println(maxChar);
        }
    }
}
