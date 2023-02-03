package com.example.baekjoon.lv3;

import java.io.*;
import java.util.StringTokenizer;

public class Q11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        String str;

        while ((str = br.readLine()) != null) {
            st = new StringTokenizer(str, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int result = a + b;
            bw.write(result + "\n");
        }

        br.close();

        bw.flush();
        bw.close();
    }
}
