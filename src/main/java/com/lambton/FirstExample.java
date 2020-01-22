package com.lambton;

public class FirstExample {
    public static void main(String[] args) {
        System.out.println("Welcome to JAVA Programming");
        for (int i=1; i<=10; i++)
            System.out.println("Nikita Sandhu");

            //Day 2 code Starts from here
        int a = 100;
        int b;
        b = 200;
        int c=a+b;
        System.out.println(a);
        System.out.println(b);
        System.out.println("Sum = "+ a + b);
        System.out.println("Sum = "+ (a + b));
        System.out.println(a + b +"Sum");

        short X = 1000;
        System.out.println("Short MAX="+ Short.MAX_VALUE);
        System.out.println("Short MIN="+ Short.MIN_VALUE);

        long y = 500;
        System.out.println(y);
        System.out.println("Long MAX="+ Long.MAX_VALUE);
        System.out.println("Long MAX="+ Long.MAX_VALUE);

        float f1 = 1000.50F;
        double f2 = 1000.30D;

        System.out.println("f1 = "+f1);
        System.out.println("f2 = "+f2);

        float f3 = 10/3F;
        System.out.println("f3 = "+f3);

        float f4 = 10F/3;
        System.out.println("f4 = "+f4);

        float f5 = (float)10/3;
        System.out.println("f5 = "+f5);

        int x1 = 1_00_00/10;
        System.out.println("x1 = "+x1);

        double x2 = 1_00_00.5;
        System.out.println("x2 = "+x2);
    }
}