package com.epam.rd.java.basic.practice1;

public class Part7 {

    public static void main(String[] args) {
     int digit1 = Integer.parseInt(args[0]);
      String char1 = String.valueOf(args[1]);
       String char2 = String.valueOf(args[2]);
       System.out.println(char1 + " --> " + Part5.chars2digits(char1));
        System.out.println(digit1 + " --> " + Part5.digits2chars(digit1));
         System.out.println(char2 + " --> " + Part5.rightColumn(char2));

    }

    public static int str2int(String number) {
         int digit = 0;
  for (int i = number.length(); i > 0; i--) {
   digit += (int) (number.charAt(number.length() - i) - 64)
     * Math.pow(26, number.length() - i);
  }
  return digit;
        //return 0;
    }

    public static String int2str(int number) {
         String chars = "";
  String charsMirror = "";
  int modul;
  int divident = number;
  while (divident != 0) {
   modul = divident % 26;
   if (modul == 0) {
    chars += "Z";
    divident = (divident - 1) / 26;
   } else {
    chars += (char) (modul + 64);
    divident = (divident - modul) / 26;
   }
  }
  for (int i = 0; i < chars.length(); i++)
   charsMirror += chars.charAt(chars.length() - i - 1);
  return charsMirror;

        //return null;
    }

    public static String rightColumn(String number) {
        String chars = "";
       int num;
        num = chars2digits(number);
        num++;
        chars = digits2chars(num);
      return chars;
        //return null;
    }
}
