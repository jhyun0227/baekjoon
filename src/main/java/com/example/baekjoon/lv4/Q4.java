package com.example.baekjoon.lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[9];
        for (int i = 0; i < 9; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }

        int max = 0;
        int count = 0;

        for (int i = 0; i < 9; i++) {
            if (max < array[i]) {
                max = array[i];
                count = i + 1;
            }
        }

        br.close();

        System.out.println(max);
        System.out.println(count);
    }
}
