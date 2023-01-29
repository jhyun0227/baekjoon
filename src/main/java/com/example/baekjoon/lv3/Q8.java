package com.example.baekjoon.lv3;

import java.io.*;

public class Q8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            String star = "";
            for (int j = 1; j <= i; j++) {
                star += "*";
            }

            bw.write(star + "\n");
        }
        br.close();

        bw.flush();
        bw.close();
    }
}
