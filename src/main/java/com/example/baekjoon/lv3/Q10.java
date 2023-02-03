package com.example.baekjoon.lv3;

import java.io.*;

public class Q10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean bool = true;
        while (bool) {
            String str = br.readLine();
            int target = str.indexOf(" ");

            int a = Integer.parseInt(str.substring(0, target));
            int b = Integer.parseInt(str.substring(target + 1));

            if (a == 0 && b == 0) {
                bool = false;
                break;
            }

            int result = a + b;
            bw.write(result + "\n");
        }

        br.close();

        bw.flush();
        bw.close();
    }
}
