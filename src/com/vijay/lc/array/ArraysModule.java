package com.vijay.lc.array;

import java.util.Arrays;

public class ArraysModule {
    public static void main(String[] args) {
        String[] names = {"a", "b"};
        int[] nums;
        int[] newNums;
        nums = new int[4];
        newNums = new int[]{12,1, 2, 3, 4, 5};
        nums =  newNums;
        System.out.println("Example for Array print and declaration: " + Arrays.toString(nums));

        Array numbers =  new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(90);
        numbers.insert(40);
        numbers.insert(49);
//        numbers.insert(60);
//        System.out.println("Largest Value returned: " + numbers.max());
        numbers.removeAt(0);
        System.out.println("Index of Item Input return -1 if not valid: " + numbers.indexOf(300));
        System.out.println("Index of Item Input : " + numbers.indexOf(30));
        numbers.print();

    }
}
