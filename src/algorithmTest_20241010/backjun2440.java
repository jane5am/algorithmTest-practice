package algorithmTest_20241010;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backjun2440 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        // 세로줄 row 입력받기
        int row = Integer.parseInt(br.readLine());

        for(int i = 0; i < row ; i++){
            for(int j = row-i; j > 0 ; j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
