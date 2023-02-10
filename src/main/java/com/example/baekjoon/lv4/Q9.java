package com.example.baekjoon.lv4;

import java.io.*;
import java.util.StringTokenizer;

public class Q9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int c = Integer.parseInt(br.readLine()); //테스트케이스의 수

        StringTokenizer[] st = new StringTokenizer[c];

        for (int i = 0; i < c; i++) {
            st[i] = new StringTokenizer(br.readLine(), " ");

            int n = Integer.parseInt(st[i].nextToken()); //하나의 테스트의 학생의 수
            double[] array = new double[n]; //학생의 점수를 담을 배열
            double addScore = 0.0; //점수의 합산을 저,장할 변수

            for (int j = 0; j < n; j++) { //배열에 점수를 담고, 합산
                array[j] = Double.valueOf(st[i].nextToken());
                addScore += array[j];
            }

            double average = addScore / n; //점수 평균을 소수점 3자리 까지

            int count = 0; //평균을 넘는 사람의 수를 담을 변수
            for (int k = 0; k < n; k++) { //위에 저장한 배열에서 각각의 점수를 평균과 비교하여 점수가 높은 경우 카운트
                if (array[k] > average) {
                    count++;
                }
            }

            // (100 / 학생의 수 * 평균을 넘은 학생의 수)를 소수점 3자리까지 구하여 BufferedWriter에 저장
            bw.write(String.format("%.3f", (double) 100 / n * count) + "%" + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
