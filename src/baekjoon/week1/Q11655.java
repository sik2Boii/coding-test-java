package baekjoon.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;

public class Q11655 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringBuilder sb = new StringBuilder(input.length());

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c >= 65 && c <= 90) {
                c = (c + 13 > 90) ? (char) (c + 13 - 26) : (char) (c + 13);
            } else if (c >= 97 && c <= 122) {
                c = (c + 13 > 122) ? (char) (c + 13 - 26) : (char) (c + 13);
            }
            sb.append(c);
        }

        System.out.print(sb.toString());

    }
}
