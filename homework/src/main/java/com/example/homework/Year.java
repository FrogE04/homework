package com.example.homework;

public class Year {
    public  static  void main(String[] argv) {
        java.util.Scanner scanner= new
                java.util.Scanner(System.in);

        System.out.println("input Year :");
        int inp=scanner.nextInt();

        if(inp%4==0)
            System.out.println("yes is Leap year!");
        else
            System.out.println("NO!??????");
    }
}
