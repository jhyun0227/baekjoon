package com.example.baekjoon.lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        //값을 우선 배열에 담는다.
        String[] array = new String[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = br.readLine();
        }

        //값을 뽑아 내어 계산한다
        for (int i = 0; i < array.length; i++) {
            int score = 0;
            int result = 0;

            for (int j = 0; j < array[i].length(); j++) {
                /*
                char c = array[i].charAt(j);

                if (j == 0 && c == 'O') { //첫글자가 O일 경우
                    result += score;
                } else if (j == 0 && c == 'X') { //첫글자가 X일 경우

                } else if (j != 0 && c == 'O') { //해당글자가 O일 경우
                    if (array[i].charAt(j - 1) == 'O') { //해당 글자가 O이면서 전글자가 O일 경우 가산점
                        score++;
                        result += score;
                    } else { // 해당글자가 O이면서 전글자가 X일 경우에는 1점만을 더한다.
                        score = 1;
                        result += score;
                    }
                } else if (j != 0 && c == 'X') { //해당글자가 X일 경우 가산점을 초기화한다.
                    score = 1;
                }
                */

                if (array[i].charAt(j) == 'O') {
                    score++;
                } else {
                    score = 0;
                }

                result += score;
            }

            System.out.println(result);
        }
    }
}
