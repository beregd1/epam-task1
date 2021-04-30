package com.epam.rd.java.basic.practice1;

public class Part5 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int sum = 0;

        while (x != 0) {
            sum += x % 10;
            x /= 10;
        }
        System.out.print(sum);
    }
}
