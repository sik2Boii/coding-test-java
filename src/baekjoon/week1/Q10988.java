package baekjoon.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10988 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] input = new String[str.length()];

        for (int i = 0; i < str.length(); i++) {
            input[i] = str.charAt(i) + "";
        }

        String[] inputReverse = new String[str.length()];
        int index = 0;
        for (int i = str.length() -1 ; i >= 0 ; i--) {
            inputReverse[i] = str.charAt(index++) + "";
        }

        boolean[] result = new boolean[str.length()];

        for (int i = 0; i < str.length(); i++) {
            if(input[i].equals(inputReverse[i])) {
                result[i] = true;
            }
        }

        for (boolean b : result) {
            if (b == false) {
                System.out.println("0");
                return;
            }
        }

        System.out.println("1");
    }
}
