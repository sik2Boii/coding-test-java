package baekjoon.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1629_V2 {
    static long c;

    static long powMod(long a, long b) {
        if (b == 1) return a % c;
        long ret = powMod(a, b / 2);
        ret = (ret * ret) % c;
        if ((b & 1) == 1) ret = (ret * a) % c;
        return ret;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        c = Long.parseLong(st.nextToken());
        System.out.println(powMod(a, b));
    }
}
