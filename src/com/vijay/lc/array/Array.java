package com.vijay.lc.array;

public class Array {
    private int[] items;
    private int count;
    public Array(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        if(items.length == count) {
            int[] newItems = new int[count * 2];
            for(int i=0;i<count;i++) {
                newItems[i] = items[i];
            }
        items = newItems;
        }
        items[count++] = item;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException();
        } else {
            for(int i = index; i < count-1; i++) {
                items[i] = items[i + 1];
            }
        count--;
        }
    }

    public int indexOf(int item) {
        // O(n) Time Complexity because worst possible would last item index
        for (int i=0; i<count;i++){
            if(items[i] == item) {
                return i;
            }
        }
        return -1;
    }

    public void print() {
        for (int i=0;i<count;i++){
            System.out.println(items[i]);
        }
    }

    public int max() {
        int tmp = 0;
        for (int i=0;i<count;i++)
            if(items[i] > tmp)
                tmp = items[i];
            return tmp;
    }

}
