package baekjoon.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10808_V2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String reverse = new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(reverse) ? "1" : "0");
    }
}
