package com.example.baekjoon.lv2;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        //모든 변수가 같지 않을 경우
        if (a != b && a != c && b != c) {
            int max;
            if (a > b) {
                //a > (b,c)
                if (a > c) {
                    max = a;
                }
                // c > a > b
                else {
                    max = c;
                }
            } else {
                // b > (a,c)
                if (b > c) {
                    max = b;
                }
                // c > b > a
                else {
                    max = c;
                }
            }
            System.out.println(max * 100);
        }
        //적어도 한 쌍 이상의 서로 같은 변수가 있을 떄
        else {
            //모든 변수가 같을 경우
            if (a == b && a == c && b == c) {
                System.out.println(10000 + a * 1000);
            }
            //한 쌍 이상의 서로 같은 변수가 있을 경우
            else {
                //a == b or a == c
                if (a == b || a == c) {
                    System.out.println(1000 + a * 100);
                }
                //b == c
                else {
                    System.out.println(1000 + b * 100);
                }
            }
        }
        
        sc.close();
    }
}
