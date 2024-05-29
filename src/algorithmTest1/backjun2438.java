package algorithmTest1;// 백준 2438번 별찍기1
// 밖에 있는 반복문은 입력값만큼 반복된다
// 안에 있는 반복문은 행의 갯수만큼 반복된다
// 백준 2438번 별찍기1
// 밖에 있는 반복문은 입력값만큼 반복된다
// 안에 있는 반복문은 행의 갯수만큼 반복된다

import java.util.Scanner;

public class backjun2438 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 1; i <= N ; i++) {

            for(int j = 1 ; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}