package com.example.baekjoon.lv1;

import java.util.Scanner;

public class lv5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        //형변환을 해주어 정수값이 아닌 소수값을 가질 수 있도록 해야함
        Double ab = (double)a / b;
        System.out.println(ab);
    }
}
