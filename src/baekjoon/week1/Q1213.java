package baekjoon.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Q1213 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < input.length(); i++) {
            map.put(input.charAt(i), map.getOrDefault(input.charAt(i), 0) + 1);
        }

        int cnt = 0;
        for (Integer i : map.values()) {
            if (i % 2 != 0) {
                cnt++;
            }
        }

        if (cnt <= 1) {
            System.out.println("1111");
        } else {
            System.out.println("I'm Sorry Hansoo");
        }
    }
}
