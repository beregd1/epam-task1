package com.epam.rd.java.basic.practice1;

public class Part7 {
    private static final int ENG = 26;
    private static final int START = 64;
    private static final String ARROW = " ==> ";


    public static int str2int(String number) {
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            char sym = number.charAt(i);
            sum += (int) Math.pow(ENG, (double) number.length() - 1 - i) * (sym - START);
        }
        sum += Math.pow(ENG, 0) - 1;
        return sum;
    }

    public static String int2str(int number) {
        String chr = "";
        String chr2 = "";
        int sym;
        while (number != 0) {
            sym = number % ENG;
            if (sym == 0) {
                chr += "Z";
                number = (number - 1) / ENG;
            } else {
                chr += (char) (sym + START);
                number = (number - sym) / ENG;
            }
        }
        for (int i = 0; i < chr.length(); i++) {
            chr2 += chr.charAt(chr.length() - i - 1);
        }
        return chr2;
    }

    public static String rightColumn(String number) {
        return int2str(str2int(number) + 1);
    }

    public static void main(String[] args) {
        String[] letter = new String[]{"A", "B", "Z", "AA", "AZ", "BA", "ZZ", "AAA"};
        int[] number = new int[]{1, 2, 26, 27, 52, 53, 702, 703};
        for (int i = 0; i < letter.length; i++) {
            System.out.print(letter[i] + ARROW + str2int(letter[i]) + ARROW + int2str(number[i]) + "\n");
        }
    }
}
