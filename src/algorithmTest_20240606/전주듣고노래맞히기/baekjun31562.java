// 백준 31562 전주 듣고 노래 맞히기 , 난이도 : 브론즈1
// 메모리 28784KB, 시간 768ms

package algorithmTest_20240606.전주듣고노래맞히기;

import java.util.*;
import java.util.stream.Collectors;

public class baekjun31562 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        // 1. 음을 아는 노래갯수, 맞히기 시도할 노래 갯수 입력받기
        String[] N = sc.nextLine().split(" ");
        int songNum = Integer.parseInt(N[0]); //음을 아는 노래 갯수
        int tryNum = Integer.parseInt(N[1]); // 맞히기 시도할 노래 갯수

        HashMap<String, String> map = new HashMap<>();
        // "TwinkleStar" : "C C G"
        // 2. 노래제목 길이, 노래 제목, 음이름 입력받기
        int[] songTitleLength = new int[songNum]; //노래제목 길이

        String songTitle ; // 노래제목
        for (int i = 0; i < songNum; i++) {
            StringTokenizer st = new StringTokenizer(sc.nextLine());
            songTitleLength[i] = Integer.parseInt(st.nextToken());
            songTitle = st.nextToken();

            for(int j = 0; j < 7; j++){
                sb.append(st.nextToken()).append(" ");
            }
            String pitch = String.valueOf(sb);
            String threePitch = pitch.substring(0,5); //앞에 3개만 자르기

            map.put(songTitle, threePitch); //map에 노래제목: 음이름 넣기

            sb.setLength(0);
        }

        // 3. 정답 노래의 첫 세음 입력받기
        String[] trySong = new String[tryNum];
        for(int i = 0; i < tryNum; i++){
            trySong[i] = sc.nextLine();
        }


        int cnt = 0;
        String name = "";
        //  4. 첫 세음 비교해서 노래 맞히기
        for(int j = 0; j < tryNum; j++){
             for (String key : map.values()) {

//                  System.out.println("key : " + key);
//                  System.out.println("trySong : " + trySong[j]);
                  if( trySong[j].equals(key)) {

                      List<String> foundKey = map.entrySet()
                              .stream()
                              .filter(entry -> Objects.equals(entry.getValue(),key))
                              .map(Map.Entry::getKey)
                              .collect(Collectors.toList());
                      cnt = foundKey.size();
                      name = foundKey.get(0);
                }

            }

             if ( cnt == 0 ) {
                 System.out.println("!");
             } else if (cnt == 1) {
                 System.out.println(name);
             }else {
                 System.out.println("?");
             }
            cnt = 0;


        }


    }
}
