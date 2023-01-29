package com.example.baekjoon.lv3;

import java.io.*;

public class Q7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 1; i <= t; i++) {
            String str = br.readLine();
            int target = str.indexOf(" ");
            int a = Integer.parseInt(str.substring(0, target));
            int b = Integer.parseInt(str.substring(target + 1));
            int result = a + b;

            bw.write("Case #" + i + ": " + a + " + " + b + " = " + result + "\n");
        }

        br.close();

        bw.flush();
        bw.close();
    }
}
