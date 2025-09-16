package baekjoon.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q2309 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine().trim());
        }

        Arrays.sort(arr);

        int total = 0;
        for (int value : arr) total += value;

        int x = -1;
        int y = -1;

        outer:
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(total - arr[i] - arr[j] == 100) {
                    x = i;
                    y = j;
                    break outer;
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 9; i++) {
            if(i == x || i == y) continue;
            sb.append(arr[i]).append("\n");
        }

        System.out.println(sb);

    }
}
