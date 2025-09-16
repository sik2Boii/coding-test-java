package baekjoon.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2559 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int total = Integer.parseInt(st.nextToken());
        int tmp = Integer.parseInt(st.nextToken());

        StringTokenizer input = new StringTokenizer(br.readLine());
        int[] arr = new int[total];

        for (int i = 0; i < total; i++) {
            arr[i] = Integer.parseInt(input.nextToken());
        }

        int maxValue = -101;

        for (int i = 0; i < total - tmp + 1; i++) {
            int result = arr[i];
            for (int j = i + 1; j < tmp + i; j++) {
                result += arr[j];
                if(maxValue == -101 && i ==0) {
                    maxValue = result;
                }
            }

            if(maxValue <= result) {
                maxValue = result;
            }
        }

        System.out.println(maxValue);
    }
}
