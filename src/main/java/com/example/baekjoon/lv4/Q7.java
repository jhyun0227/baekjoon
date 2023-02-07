package com.example.baekjoon.lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine()); //시험본 과목의 개수
        int[] array = new int[n]; //점수를 담을 배열

        st = new StringTokenizer(br.readLine(), " "); //시험본 과목의 성적

        int max = 0; //최고점

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(st.nextToken());

            if (max < array[i]) {
                max = array[i];
            }
        }

        double average = 0.0;
        for (int i = 0; i < array.length; i++) {
                average += (double) array[i] / max * 100;
        }

        System.out.println(average / n);
    }
}
