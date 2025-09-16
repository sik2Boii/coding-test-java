package baekjoon.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Q3986 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            Deque<Character> stk = new ArrayDeque<>();

            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);

                if (!stk.isEmpty() && stk.getLast() == c) {
                    stk.removeLast();
                } else {
                    stk.addLast(c);
                }
            }

            if (stk.isEmpty()) result++;
        }
        System.out.println(result);
    }
}
