package com.example.baekjoon.lv6;

import java.io.*;

public class Q3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        for (int i = 97; i < 123; i++) {
            String alphabet = (char) i + "";

            int result = str.indexOf(alphabet);

            bw.write(result + "\n");
        }

        bw.flush();

        br.close();
        bw.close();
    }
}
