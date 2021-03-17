package com.epam.rd.java.basic.practice1;

public class Part4 {

    public static void main(String[] args) {
    int x = Integer.parseInt(args[0]);
    int y = Integer.parseInt(args[1]);
      while (y != 0) {
      int z = x % y;
       x = y;
        y = z;
    }
     System.out.print(x);    
   }

}
