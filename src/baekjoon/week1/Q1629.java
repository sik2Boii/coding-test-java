package baekjoon.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1629 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] num = new int[3];

        for (int i = 0; i < 3; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        int tmp = num[0];
        Long result = (long) tmp;
        for (int i = 1; i <= num[1]; i++) {
            result *= (long) tmp ;
        }

        result = result % num[2];

        System.out.println(result);

    }
}
