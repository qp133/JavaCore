package org.example.service;

public class MyGeneric <E> {
    public E[] arr;

    public MyGeneric(E[] arr) {
        this.arr = arr;
    }

    public MyGeneric() {
    }

    public E[] getArr() {
        return arr;
    }

    public void setArr(E[] arr) {
        this.arr = arr;
    }

    public static <E> void printArray(E[] arr) {
        for (E t : arr) {
            System.out.print(t);
        }
        System.out.println();
    }
}
