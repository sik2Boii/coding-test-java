package baekjoon.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2468 {

    static int[][] arr;
    static boolean[][] visited;

    static int n;
    static int result = 1; // 아무 지역도 물에 잠기지 않을 경우

    // 상, 우 하, 좌
    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, 1, 0, -1};

    private static void dfs(int y, int x, int height) {
        visited[y][x] = true;
        for (int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];

            if (ny < 0 || nx < 0 || ny >= n || nx >=n) {
                continue;
            }

            if (!visited[ny][nx] && arr[ny][nx] > height) {
                dfs(ny, nx, height);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        if (1 > n || n > 100) return;

        arr = new int[n][n];

        int maxHeight = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] > maxHeight) {
                    maxHeight = arr[i][j];
                }
            }
        }

        for (int i = 1; i <= maxHeight; i++) {
            visited = new boolean[n][n];
            int cnt = 0;

            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {

                    if (!visited[j][k] && arr[j][k] > i) {
                        dfs(j, k, i);
                        cnt++;
                    }
                }
            }
            if (cnt > result) {
                result = cnt;
            }
        }
        System.out.println(result);
    }

}
