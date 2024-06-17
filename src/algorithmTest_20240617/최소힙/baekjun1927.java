// 백준 1927번 최소 힙, 난이도 : 실버 2
// 메모리 : 33988KB , 시간 : 816ms
package algorithmTest_20240617.최소힙;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class baekjun1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // 배열에 값 넣기
        for (int i = 0; i < num; i++) {
            int line = Integer.parseInt(br.readLine());

            if( line == 0 ){
                if( minHeap.isEmpty() ){
                    System.out.println(0);
                    continue;
                }
                System.out.println((minHeap.poll()));
            }else {
                minHeap.add(line);
            }
        }



    }
}
