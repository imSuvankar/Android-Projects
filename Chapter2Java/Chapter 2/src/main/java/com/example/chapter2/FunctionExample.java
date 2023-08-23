package com.example.chapter2;

public class FunctionExample {

    static double getAverage(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    // 1 -  Write a java program to print the multiplication table of a given number.
    public static void multiplicationTable(int n) {
        String ans = String.format("Multiplication table of %d\n\n" + n);
        for(int i = 1; i <= n; i++) ans += String.format("%d * %d = %d\n");
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int a = 5, b = 6, c = 8;
        System.out.println(getAverage(a, b, c));

        int[] arr = {1,2,3,4,5,6,7,8,9};
        int find = 6;

//      System.out.println(BinarySearch.binarySearch(arr, find));

        BinarySearch obj1 = new BinarySearch();
        System.out.println(obj1.binarySearch(arr, find));

        FindANumber obj2 = new FindANumber();
        System.out.println(obj2.linearSearch(arr, find));
        System.out.println(obj2.binarySearch(arr, find));

        HomeWorks hw = new HomeWorks();
        hw.multiplicationTable(5);
        hw.add(5,6);
        hw.findDay(3);
        hw.getSumOfFirstNEven(5);
        hw.pattern(5);
    }
}
