package algorithmTest_20240824;

import java.util.Scanner;

public class baekjun10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        int value = sc.nextInt();
        int cnt = 0;
        for (int i = 0; i < num; i++) {
            if (value == arr[i]) {
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}
