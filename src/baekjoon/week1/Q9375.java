package baekjoon.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < num1; i++) {
            Map<String, Integer> map = new HashMap<String, Integer>();
            int num2 = Integer.parseInt(br.readLine());

            for (int j = 0; j < num2; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                String category = st.nextToken();
                map.put(category, map.getOrDefault(category, 0) + 1);
            }

            int result = 1;
            for (int count : map.values()) {
                result *= count +1;
            }
            result--;
            sb.append(result).append("\n");
        }

        System.out.println(sb.toString());
    }

}
