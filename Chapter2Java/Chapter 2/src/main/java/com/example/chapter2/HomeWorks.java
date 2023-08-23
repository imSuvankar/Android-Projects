package com.example.chapter2;

public class HomeWorks {

    // // 1 -  Write a java program to print the multiplication table of a given number.
    public static void multiplicationTable(int n) {
        System.out.println("Multiplication table of " + 5 + ":");
        for(int i = 1; i <= 10; i++) System.out.println(String.format("%d * %d = %d", n, i, n*i));
    }

    // // 2 -  Write a java program to add two numbers.
    public static void add(int a, int b) {
        System.out.println(String.format("\n%d + %d = %d", a, b, a+b));
    }

    // // 3 -  Write a java program to find out the day of the week given the number.
    public static void findDay(int n) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(String.format("\nDay %d is %s (as Monday is first day of week)", n, days[n-1]));
        // i am not thinking about ArrayOutOfBoundException here
    }

    // // 4 –  Write a java program to calculate income tax on a given income considering Indian laws.
    // since I already did this way too many times before, i can skip it

    // // 5 – Write a java program to sum first n even numbers using for loops.
    public static void getSumOfFirstNEven(int n) {
        int sum = 0;
        for(int i = 0; i < 2*n; i+=2) sum += i;
        System.out.println(String.format("\nSum of first %d number is: %d", n, sum));
    }

    public static void pattern(int n) {
    /*
        *****
         ****
          ***
           **
            *
    */
        System.out.println("\nPattern for n = " + n);
        for(int i = 0; i < n; i++) {
            if(i != 0) for(int j = 0; j < i; j++) System.out.print(" ");
            for(int j = n; j > i; j--) System.out.print("*");
            System.out.println();
        }
    }
}
