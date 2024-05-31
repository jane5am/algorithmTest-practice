package algorithmTest_20240531.알고리즘수업_알고리즘의수행시간6;

import java.io.*;

public class baekjun24267 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());

        br.close();

        System.out.println( n*(n-1)*(n-2)/6);
        System.out.println(3);


    }
}
