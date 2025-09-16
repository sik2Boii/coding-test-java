package baekjoon.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9996_V2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        String pattern = br.readLine();
        int pos = pattern.indexOf('*');
        String prefix = pattern.substring(0, pos);
        String suffix = pattern.substring(pos + 1);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < number; i++) {
            String input = br.readLine();

            if (prefix.length() + suffix.length() > input.length()) {
                sb.append("NE\n");
                continue;
            }

            if (input.startsWith(prefix) && input.endsWith(suffix)) {
                sb.append("DA\n");
            } else {
                sb.append("NE\n");
            }
        }
        System.out.println(sb.toString());
    }
}
