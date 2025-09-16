package baekjoon.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1940 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Integer[] arr = new Integer[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = 0;

        for (int i = 0; i < n; i++) {
            int value1 = arr[i];
            for (int j = i + 1; j < n; j++) {
                int value2 = arr[j];
                if (value1 + value2 == m) {
                    result++;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
