package baekjoon.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2178 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] dy = {-1, 0, 1, 0};
        int[] dx = {0, 1, 0, -1};
        int[][] miro = new int[n][m];
        int[][] visited = new int[n][m];

        for (int i = 0; i < n; i++) {
            String line = br.readLine().trim();
            for (int j = 0; j < m; j++) {
                miro[i][j] = line.charAt(j) - '0';
            }
        }

        Queue<int[]> q = new ArrayDeque<>();
        visited[0][0] = 1;
        q.add(new int[]{0, 0});

        while (!q.isEmpty()) {
            int[] yx = q.poll();
            int y = yx[0];
            int x = yx[1];

            for (int i = 0; i < 4; i++) {
                int ny = y + dy[i];
                int nx = x + dx[i];

                if (ny < 0 || ny >= n || nx < 0 || nx >= m) {
                    continue;
                }

                if (miro[ny][nx] == 0) {
                    continue;
                }

                if (visited[ny][nx] != 0) {
                    continue;
                }

                visited[ny][nx] = visited[y][x] + 1;
                q.add(new int[]{ny, nx});

            }
        }

        System.out.println(visited[n - 1][m - 1]);
    }
}
