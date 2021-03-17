package com.epam.rd.java.basic.practice1;

public class Part6 {

    public static void main(String[] args) {
       method(new String[]{"10"});
    }

    private static void method(String[] args) {
        int m = Integer.parseInt(args[0]);
        int[] array = new int[m];
        int counter = 0;
        int nextNumber = 2;

        boolean isSimple;
        while (counter < m){
            int i = 0;
            isSimple = true;
            while (isSimple && i < counter){
                if (nextNumber % array[i] ==0){
                    isSimple = false;
                }
                i++;
            }
            if (isSimple){
                array[counter] = nextNumber;
                counter++;
            }
            nextNumber++;
        }
        String result = myJoin(array," ");
        System.out.println(result);
    }
    public static String myJoin(int[] arr, String separator){
        if(null == arr || 0 == arr.length) return "";

        StringBuilder sb = new StringBuilder(256);
        sb.append(arr[0]);

        if (arr.length == 1) return sb.toString();
        for(int i = 1; i<arr.length; i++) sb.append(separator).append(arr[i]);
        return sb.toString();
    }

}


