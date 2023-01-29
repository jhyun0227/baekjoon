package com.example.baekjoon.lv2;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();

        int minute = M-45;

        if (minute < 0) {
            H--;
            M = 60 + minute;
            if (H < 0) {
                H = 23;
            }
            System.out.println(H + " " + M);
        } else {
            System.out.println(H + " " + minute);
        }

        sc.close();
    }
}
