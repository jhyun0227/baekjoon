package com.example.baekjoon.lv3;

import java.io.*;

public class Q9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            String star = "";
            for (int j = 1; j <= n - i; j++) {
                star += " ";
            }
            for (int k = 1; k <= i; k++) {
                star += "*";
            }

            bw.write(star + "\n");
        }
        br.close();

        bw.flush();
        bw.close();
    }
}
