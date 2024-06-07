// 백준 2805번 나무 자르기, 난이도 : 실버2
// 메모리 145456KB, 시간 760ms
package algorithmTest_20240607.나무자르기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class baekjun2805 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String tree= br.readLine();

        StringTokenizer st = new StringTokenizer(tree);
        int treeNum = Integer.parseInt(st.nextToken()); // 나무의 수
        int need = Integer.parseInt(st.nextToken()); // 필요한 나무 길이

        String treeHeight = br.readLine();
        st = new StringTokenizer(treeHeight);

        ArrayList<Integer> treeList = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < treeNum; i++) {
            treeList.add(Integer.parseInt(st.nextToken())); // 나무 높이 list에 저장하기
            if( treeList.get(i)> max ){
                max = treeList.get(i); //max값을 바꿔주기
            }
        }

        int start = 0;
        int end = max;

        while(start <= end){ //start가 end와 같거나 클때까지
            int mid = (start + end) / 2; //중간
            long sum = 0; // 자른 나무 합

            // mid 높이 보다 큰 경우 그 차이만큼 더해준다
            for(int i =0; i < treeNum; i++){
                if(treeList.get(i) > mid){
                    sum += treeList.get(i) - mid ;
                }
            }

            // 필요한 나무 길이와 비교하여 이분 탐색 범위 조정하기
            if(sum >= need) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println(end);
    }
}
