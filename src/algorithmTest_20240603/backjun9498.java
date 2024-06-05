// 1. 시험 점수 입력받기
// 2. if else문을 통해 각 구간 나눠주기

package algorithmTest_20240603;

import java.util.Scanner;

public class backjun9498 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. 시험 점수 입력받기
        int score = sc.nextInt(); //시험점수

        // 2. if else문을 통해 각 구간 나눠주기
        if ( 90 <= score && score <= 100 ){
            System.out.println("A");
        }else if ( 80 <= score && score <= 89){
            System.out.println("B");
        }else if ( 70 <= score && score <= 79){
            System.out.println("C");
        }else if ( 60 <= score && score <= 69){
            System.out.println("D");
        }else {
            System.out.println("F");
        }

    }
}
