package com.example.baekjoon.lv5;

public class Q1 {
    public long sum(int[] a) {
        long add = 0;

        for (int b : a) {
            add += b;
        }

        return add;
    }
}
