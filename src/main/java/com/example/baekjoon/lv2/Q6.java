package com.example.baekjoon.lv2;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int add = B+C;

        if (add >= 60) {

            int hour = add / 60;
            int minute = add % 60;

            A += hour;
            B = 0 + minute;
            if (A == 24) {
                A = 0;
            } else if (A > 24) {
                A = A - 24;
            }
            System.out.println(A + " " + B);

        } else {
            System.out.println(A + " " + add);
        }

        sc.close();
    }
}
