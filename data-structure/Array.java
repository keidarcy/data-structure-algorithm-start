package com.xyh;

import java.util.Arrays;

public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
        System.out.println(Arrays.toString(items));
    }

    public void inset(int item) {
        if (items.length == count) {
            int[] newItems = new int[count * 2] ;

            for (int i = 0; i < count; i++) {
                 newItems[i] = items[i];
            }

            items = newItems;
        }



        items[count++] = item;
    }

    public void removeAt(int index) {
         if (index < 0 || index > count - 1) {
            throw new IllegalArgumentException();
         } else{
             for (int i = index; i < count; i++) {
                 items[i - 1] = items[i];
             }
             count--;
         }
    }

    public int indexOf(int value) {
        int result = -1;
        for (int i = 0; i < count; i++) {
            if(items[i] == value) {
                result = i;
            }
        }
        System.out.println("IndexOf" + value + " is " + result);
        return result;
    }
}
