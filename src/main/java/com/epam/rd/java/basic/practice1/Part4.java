package com.epam.rd.java.basic.practice1;

public class Part4 {

    public static void main(String[] args) {
    int x = Integer.parseInt(args[0]);
    int y = Integer.parseInt(args[1]);
       System.out.print("NOD " + x + " and " + y + " = ");
      while (y != 0) {
      int tmp = x % y;
       x = y;
        y = tmp;
    }
     System.out.println(x);    
   }

}
