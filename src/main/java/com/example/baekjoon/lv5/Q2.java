package com.example.baekjoon.lv5;

public class Q2 {

    /**
     * 1만개의 내용물을 가지는 배열을 만들고
     * 1만개의 숫자를 반복문으로 돌려 나오는 숫자를 배열의 인덱스로 이용하여 true값을 저장한다.
     * 그 배열을 다시 반복문으로 돌려서 false인 부분을 시스템 출력하면 되는부분
     */
    public static int d(int number) {
        int sum = number;

        while (number != 0) {
            sum += number % 10;
            number = number/10;
        }

        return sum;
    }

    public static void main(String[] args) {
        boolean[] boolArray = new boolean[10001];

       for (int i = 1; i < 10001; i++) {
            int n = d(i);

            if (n < 10001) {
                boolArray[n] = true;
            }
        }

        for (int i = 1; i < 10001; i++) {
            if (!boolArray[i]) {
                System.out.println(i);
            }
        }
    }
}