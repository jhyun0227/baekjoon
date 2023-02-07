package com.example.baekjoon.lv4;

import java.io.*;
import java.util.StringTokenizer;

public class Q2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String str = br.readLine();
        int target = str.indexOf(" ");
        int n = Integer.parseInt(str.substring(0, target)); //배열 크기
        int x = Integer.parseInt(str.substring(target + 1)); //비교할 값

        int[] array = new int[n]; //값을 담을 배열
        int i = 0;
        st = new StringTokenizer(br.readLine(), " ");
        while (st.hasMoreTokens()) {
            array[i] = Integer.parseInt(st.nextToken());
            i++;
        }

        for (int j = 0; j < array.length; j++) {
            if (array[j] < x) {
                System.out.println(array[j]);
            }
        }

        br.close();
    }
}
