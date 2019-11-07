package com.example.homework;

public class Time1 {
    public static class MyClass {
        public static void main(String[] argv) {
            java.util.Scanner scanner = new
                    java.util.Scanner(System.in);

            System.out.println("input second (sec) :");
            int inp = scanner.nextInt();
            int hu = inp / 3600;
            int Min = (inp % 3600) / 60;
            int sec = (inp % 3600) % 60;
            System.out.println("Hour:" + hu + "  Minute:" + Min + "  Second:" + sec);
        }
    }
}