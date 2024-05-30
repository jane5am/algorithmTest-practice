// map으로 키 : 값을 넣어준다
// 각 과일의 이름이 키의 이름이 된다
// 키의 값이 5가되면 yes를 반환

package algorithmTest_20240530.할리갈리;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class baekjun27160 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int userNum = sc.nextInt(); // 사람수
        sc.nextLine();

        Map<String, Integer> map = new HashMap<>();
        map.put("STRAWBERRY", 0 );
        map.put("BANANA", 0 );
        map.put("LIME", 0 );
        map.put("PLUM", 0 );


        for(int i = 0; i < userNum; i++){
            String fruit = sc.next();
            int count = sc.nextInt();

            if( map.containsKey(fruit) ){
                map.put(fruit, map.get(fruit) + count);
            }
        }

        if (map.get("STRAWBERRY") == 5 || map.get("BANANA") == 5 || map.get("LIME") == 5 || map.get("PLUM") == 5) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }
}