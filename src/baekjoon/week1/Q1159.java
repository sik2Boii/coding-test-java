package baekjoon.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Q1159 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        String[] players = new String[number];

        for (int i = 0; i < players.length; i++) {
            players[i] = br.readLine();
        }

        Set<String> set = new HashSet<String>();
        for (String player : players) {
            set.add(String.valueOf(player.charAt(0)));
        }

        boolean result = false;
        StringBuilder sb = new StringBuilder();

        for (String str : set) {
            int idx = 0;
            outer1:
            for (String player : players) {
                if (player.startsWith(str)) {
                    idx++;
                    if(idx >= 5) {
                        sb.append(str);
                        result = true;
                        break outer1;
                    }
                }
            }
        }

        if(!result) {
            System.out.println("PREDAJA");
        } else {
            System.out.println(sb.toString());
        }
    }
}
