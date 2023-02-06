package com.example.baekjoon.lv4;

import java.io.*;
import java.util.StringTokenizer;

public class Q1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine()); //배열의 크기
        int[] array = new int[n]; //값을 담을 배열

        st = new StringTokenizer(br.readLine(), " "); //배열 값들
        int i = 0;
        while (st.hasMoreTokens()) {
            int a = Integer.parseInt(st.nextToken());
            array[i] = a;
            i++;
        }

        int v = Integer.parseInt(br.readLine()); //찾을 값
        int k = 0; //같은 값이 몇개일지 카운트하는 변수
        for (int j = 0; j < array.length; j++) {
            if (array[j] == v) {
                k++;
            }
        }

        br.close();
        System.out.println(k);
    }
}
