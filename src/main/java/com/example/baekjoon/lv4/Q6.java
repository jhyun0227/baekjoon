package com.example.baekjoon.lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = Integer.parseInt(br.readLine()) % 42;
        }

        int[] result = Arrays.stream(array).distinct().toArray();

        System.out.println(result.length);
    }
}
