package baekjoon.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1012 {

    // 상, 우, 하, 좌
    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, 1, 0, -1};

    static int[][] arr;
    static int[][] visited;

    static int m, n, k;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            m = Integer.parseInt(st.nextToken()); // 가로
            n = Integer.parseInt(st.nextToken()); // 세로
            k = Integer.parseInt(st.nextToken()); // 배추 갯수

            arr = new int[n][m];
            visited = new int[n][m];

            for (int j = 0; j < k; j++) {
                st = new StringTokenizer(br.readLine());

                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                arr[y][x] = 1;
            }

            int result = 0;

            for (int j = 0; j < n; j++) {
                for (int l = 0; l < m; l++) {
                    if (arr[j][l] == 1 && visited[j][l] == 0) {
                        visited[j][l] = 1;
                        dfs(j,l);
                        result++;
                    }
                }
            }
            System.out.println(result);
        }
    }

    private static void dfs(int y, int x) {
        visited[y][x] = 1;
        for (int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];

            if (ny < 0 || nx <0 || ny >= n || nx >= m) {
                continue;
            }

            if (arr[ny][nx] == 1 && visited[ny][nx] == 0) {
                dfs(ny,nx);
            }
        }
    }
}
