package baekjoon.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9996 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        String pattern = br.readLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < number; i++) {
            String input = br.readLine();
            if (input.startsWith(String.valueOf(pattern.charAt(0))) && input.endsWith(pattern.substring(pattern.length() - 1))) {
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
        }

    }
}
