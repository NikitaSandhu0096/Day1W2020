package com.lambton;

public class StringsExamples {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";

        String s3 = "Hello";
        String s4 = s1;

        String s5 = new String(s2);
        String  s6 = new String();
        s6 = "World";
        String s7 = new String("Hello");

        System.out.println("s1 ="+ s1);
        System.out.println("s2 ="+ s2);
        System.out.println("s3 ="+ s3);
        System.out.println("s4 ="+ s4);
        System.out.println("s5 ="+ s5);
        System.out.println("s6 ="+ s6);
        System.out.println("s7 ="+ s7);

        if(s1==s3){
            System.out.println("s1(" + s1 + ") = s3(" + s3 + ")");
        }else{
            System.out.println("s1(" + s1 + ") <> s3(" + s3 + ")");
        }

        if(s1.equals(s3)){
            System.out.println("s1(" + s1 + ") = s3(" + s3 + ")");
        }else{
            System.out.println("s1(" + s1 + ") NOT equals s3(" + s3 + ")");
        }


        if(s1==s7){
            System.out.println("s1(" + s1 + ") = s7(" + s7 + ")");
        }else{
            System.out.println("s1(" + s1 + ") <> s7(" + s7 + ")");
        }

        if(s1.equals(s7)){
            System.out.println("s1(" + s1 + ") = s7(" + s7 + ")");
        }else{
            System.out.println("s1(" + s1 + ") NOT equals s7(" + s7 + ")");
        }


        if(s2==s6){
            System.out.println("s2(" + s2 + ") = s6(" + s6 + ")");
        }else{
            System.out.println("s2(" + s2 + ") <> s6(" + s6 + ")");
        }

        if(s2.equals(s6)){
            System.out.println("s2(" + s2 + ") = s6(" + s6 + ")");
        }else{
            System.out.println("s2(" + s2 + ") NOT equals s6(" + s6 + ")");
        }

        s1.concat("World");
        System.out.println(s1);

        s1 = s1.concat("World");
        System.out.println(s1);

        s1.intern();
        System.out.println(s1);

        s1 = s1.replace("Hello","Hola");
        System.out.println(s1);

        s1 = s1.trim();
        System.out.println(s1);

        int a = 100;
        int b = 200;
        int c = a + b;
        String str = String.format("%d + %d = %d", a, b, c);
        System.out.println(str);

        String happyString = String.join(" ", "Welcome","to","Lambton","Toronto","Canada");
        System.out.println(happyString);

        String sadString = String.format("Welcome","to","Lambton","Toronto","Canada");
        System.out.println(sadString);

        String s8 = "Welcome to Toronto";

        for(int i=1; i<s8.length();i++){
            char ch1 = s8.charAt(i);
            System.out.println(ch1);
        }
    }
}
