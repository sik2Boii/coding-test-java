package baekjoon.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2559_V2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        int[] a = new int[num1];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num1; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;
        for (int i = 0; i < num2; i++) {
            sum += a[i];
        }

        int max = sum;

        for (int i = num2; i < num1; i++) {
            int tmp = a[i - num2];
            sum += a[i] - a[i - num2];
            if (sum > max) max = sum;
        }

        System.out.println(max);
    }
}
