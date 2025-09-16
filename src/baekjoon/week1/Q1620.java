package baekjoon.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Q1620 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        Map<Integer, String> map = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        for (int i = 1; i <= num1; i++) {
            String input = br.readLine();
            map.put(i, input);
            map2.put(input, i);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= num2; i++) {
            String input = br.readLine();

            if (Character.isDigit(input.charAt(0))) {
                int idx = Integer.parseInt(input);
                sb.append(map.get(idx)).append('\n');
            } else {
                sb.append(map2.get(input)).append('\n');
            }

        }

        System.out.println(sb);

    }
}

