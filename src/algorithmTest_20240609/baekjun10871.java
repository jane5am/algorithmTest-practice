// 백준 10871번 X보다 작은 수 , 난이도 : 브론즈 5
// 메모리 17676KB, 시간 432ms
// 1.N과 X입력받기
// 2. 수열A 입력받아서 배열에 넣기
// 3. IF (X보다 작은수일때) {출력 하기}
package algorithmTest_20240609;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjun10871 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] arr = line.split(" "); // arr[0] = N , arr[1] = X
        int N = Integer.parseInt(arr[0]);
        int X = Integer.parseInt(arr[1]);

        // 2. 수열A 입력받아서 배열에 넣기
        String line2 = br.readLine();
        String[] numArr = line2.split(" "); // 수열 배열
        int[] intNumArr = new int[N];
        for (int i = 0; i < numArr.length; i++) {
            intNumArr[i] = Integer.parseInt(numArr[i]);
        }

        // 3. IF (X보다 작은수일때) {출력 하기}
        for(int i = 0; i < N; i++){
            if( X > intNumArr[i]){
                System.out.print(intNumArr[i] + " ");
            }
        }
    }

}
