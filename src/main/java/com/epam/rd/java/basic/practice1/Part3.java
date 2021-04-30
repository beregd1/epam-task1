package com.epam.rd.java.basic.practice1;

public class Part3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (String arg : args) {
            sb.append(arg + " ");
        }
        System.out.print(sb.toString().trim());
    }
}
