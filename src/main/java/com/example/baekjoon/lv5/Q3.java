package com.example.baekjoon.lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3 {

    public static int hansoo(int x) {
        int count = 0;

        if (x < 100) {
            return x;
        } else {
            count = 99;

            for (int i = 100; i <= x; i++) {
                int hun = i / 100;
                int ten = i / 10 % 10;
                int one = i % 10;

                if ((hun - ten) == (ten - one)) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());

        System.out.println(hansoo(x));

        br.close();
    }
}
