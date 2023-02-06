package com.example.baekjoon.lv3;

import java.io.*;

public class Q12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String strN = br.readLine(); //처음 입력한 수
        String result = new String(strN); //계산을 진행할 수
        int cycle = 0; //사이클
        boolean bool = true;

        //입력받은 수가 10 미만일 경우
        if (Integer.parseInt(result) < 10) {
            result = "0" + result;
        }

        String addString;
        String strA;
        String strB;

        while (bool) {

            strA = result.substring(0, 1);
            strB = result.substring(1);

            int addAB = Integer.parseInt(strA) + Integer.parseInt(strB);

            if (addAB < 10) {
                addString = String.valueOf(addAB);
                result = strB + addString;
            } else {
                addString = String.valueOf(addAB);
                result = strB + addString.substring(1);
            }

            if (Integer.parseInt(result) == (Integer.parseInt(strN))) {
                bool = false;
            }

            //사이클 횟수 추가
            cycle += 1;

        }

        bw.write(String.valueOf(cycle));

        br.close();
        bw.flush();
        bw.close();
    }
}
