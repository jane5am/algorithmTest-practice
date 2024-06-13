// 백준 2851번, 난이도 : 브론즈 1
// 메모리 : 17704KB, 시간 : 220ms
// 1. 한줄씩 읽으면서 100 이전 값, 그 다음 합을 구한다
// 2. 100을빼보고 그 절대값이 작은걸 구한다
// 3. 만약 같다면 큰수가 출력되도록 한다
package algorithmTest_20240613.슈퍼마리오;

import java.util.ArrayList;
import java.util.Scanner;

public class baekjun2851 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrList = new ArrayList<>();
        int sum = 0;

        for(int i = 0 ; i < 10; i++){
            int num = sc.nextInt();
            sum += num;
            arrList.add(sum);
            if(sum > 100){
                break;
            }
        }
        int num1 = arrList.get(arrList.size()-2);
        int num1Abs = Math.abs(100 - num1);
//        System.out.println("num1 : " + num1);
//        System.out.println("num1Abs : " + num1Abs);
        int num2 = arrList.get(arrList.size()-1);
        int num2Abs = Math.abs(100-num2);
//        System.out.println("num2 : " + num2);
//        System.out.println("num2Abs : " + num2Abs);
        if(num1Abs == num2Abs){
            System.out.println(arrList.get(arrList.size()-1));
        }else{
            System.out.println(num1Abs > num2Abs ? num2 : num1);

        }

    }
}
