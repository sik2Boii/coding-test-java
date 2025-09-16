package baekjoon.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2979 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int[] cnt = new int[100];

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            for (int j = start; j < end; j++) {
                cnt[j]++;
            }
        }

        int result = 0;
        for (int i = 1; i < cnt.length; i++) {
            if (cnt[i] == 1) {
                result += A;
            }else if (cnt[i] == 2) {
                result += B * 2;
            }else if (cnt[i] == 3) {
                result += C * 3;

            }
        }

        System.out.println(result);

    }
}
