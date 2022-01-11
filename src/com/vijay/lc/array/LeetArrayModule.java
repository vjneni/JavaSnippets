package com.vijay.lc.array;

public class LeetArrayModule {

    public int[] intArray(){
        // Declare an integer array of 6 elements
        int[] intArray = new int[6];
        int length = 0;

        // Add 3 elements to the Array
        for (int i = 0; i < 3; i++) {
            intArray[length] = i;
            length++;
        }
        System.out.println("Current length : " + length);
        intArray[length] = 10;
        length++;
        System.out.println("Current length After inserting at END : " + length);
        return intArray;
    }
    public void printArray(int[] intArray){
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Index " + i + " contains " + intArray[i]);
        }
    }

    public void insertAtStart(int[] intArray) {
        // Time Complexity is O(n) because its very expensive operation of moving elements to right
        for (int i=3; i >= 0; i--){
            intArray[i+1] = intArray[i];
        }
        intArray[0] = 99;
        printArray(intArray);
    }

    public void insertInMiddle(int[] intArray){
        for (int i=4; i>=2;i--){
            intArray[i+1] = intArray[i];
        }
        intArray[2] = 20;
        printArray(intArray);
    }

    public static void main(String[] args) {
        LeetArrayModule obj = new LeetArrayModule();
        int[] arr = obj.intArray();
        obj.printArray(arr);
        System.out.println("Insert At Start Code Block Output From Here");
        obj.insertAtStart(arr);
        System.out.println("Insert At Middle Code Block Output From Here");
        obj.insertInMiddle(arr);
    }
}
