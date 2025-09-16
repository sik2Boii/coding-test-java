package baekjoon.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10808 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int[] cnt = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            cnt[c - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i : cnt) {
            sb.append(i).append(" ");
        }

        System.out.println(sb);

    }
}
