package com.example.baekjoon.lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] chkStu = new boolean[31];

        for (int i = 1; i <= 28; i++) {
            chkStu[Integer.parseInt(br.readLine())] = true;
        }

        for (int i = 1; i <= 30; i++) {
            if (!chkStu[i]) {
                System.out.println(i);
            }
        }
    }
}