package com.halove.base;

import algs4.StdDraw;
import algs4.Stopwatch;

/**
 * Created by xieshangwu on 2019/3/23.
 */
public class base {
    public static void main(String[] args) {
        StdDraw.line(33, 34, 343, 342);
    }

    public static int gcd(int p, int q) {
        if (q == 0) {
            return p;
        }
        Stopwatch stopwatch = new Stopwatch();
        int r = p % q;
        return gcd(q, r);
    }
}
