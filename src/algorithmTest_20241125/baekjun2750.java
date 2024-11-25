// 백준 2750번 수 정렬하기 / 난이도 : 브론즈 2
// 메모리 : 14416 KB, 시간 : 116 ms

// 문제
// N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

// 입력
// 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다.
// 둘째 줄부터 N개의 줄에는 수가 주어진다. 이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.

// 출력
// 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.

package algorithmTest_20241125;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.TreeSet;

public class baekjun2750 {
    public static void main(String[] args) throws IOException {

        // 방법 1. 배열의 Arrays.sort이용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int TC = Integer.parseInt(br.readLine());
        int[] arr = new int[TC];

        for ( int i = 0; i < arr.length; i++ ){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for( int i = 0; i < arr.length; i++ ){
            sb.append(arr[i]).append("\n");
        }

        System.out.print(sb);

        // 방법 2. TreeSet이용
        // 메모리 : 15040 KB, 시간 : 124 ms
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//
//        int TC = Integer.parseInt(br.readLine());
//        TreeSet<Integer> treeSet = new TreeSet<>();
//
//        for( int i = 0; i < TC; i++ ){
//            treeSet.add(Integer.parseInt(br.readLine()));
//        }
//
//        for (int num : treeSet) {
//            sb.append(num).append("\n");
//        }
//
//        System.out.print(sb);

    }
}