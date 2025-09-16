package baekjoon.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1159_V2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        int[] cnt = new int[26];

        for (int i = 0; i < number; i++) {
            String name = br.readLine();
            cnt[name.charAt(0) - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] > 5) sb.append((char) ('a' + i));
        }

        System.out.println(sb.isEmpty() ? "PREDAJA" : sb.toString());

    }
}
