// List에 담아서 배열의 길이를 반환한다
// List에 담을 때 띄어쓰기 기준으로 한 단어씩 넣는다
// List 담을 때 띄어쓰기 기준으로 넣을 방법을 찾다가 StringTokenizer발견!

package algorithmTest_20240530.단어의개수;


import java.util.*;

public class backjun1152 {
    public static void main(String[] args) {

        // 1번
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        StringTokenizer st = new StringTokenizer(sentence, " ");
        System.out.println(st.countTokens());

        // 2번
//        Scanner sc = new Scanner(System.in);
//        String sentence = sc.nextLine().trim();
//
//        String[] senList = sentence.split(" ");
//        System.out.println(Arrays.toString(senList));
//        if(sentence.trim().isEmpty() ) {
//            System.out.println(0);
//        }else {
//            System.out.println(senList.length);
//
//        }


    }
}
