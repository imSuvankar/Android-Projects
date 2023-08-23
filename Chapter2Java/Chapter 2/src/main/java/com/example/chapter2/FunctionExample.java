package com.example.chapter2;

public class FunctionExample {

    static double getAverage(int a, int b, int c) {
        return (a + b + c) / 3.0;
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
    }
}
