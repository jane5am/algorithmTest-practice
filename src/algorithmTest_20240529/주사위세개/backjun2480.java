package algorithmTest_20240529.주사위세개;

import java.util.Scanner;

public class backjun2480 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if ( num1 == num2 && num2 == num3 ){
            System.out.println( 10000 + ( num1 * 1000 ) );
        } else if ( num1 == num2 || num1 == num3 ){
            System.out.println( 1000 + ( num1 * 100 ) );
        } else if ( num2 == num3 ){
            System.out.println( 1000 + ( num2 * 100 ) ); ;
        } else {
            int Max = num1;

            if( Max < num2 ){
                Max = num2;
            }
            if( Max < num3 ){
                Max = num3;
            }

            System.out.println( Max * 100 );
        }

    }
}
