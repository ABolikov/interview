package org.bolikov.lesson2.task2;

import java.util.Arrays;

public class MyArrayList<T> {
    private Object[] arr;
    private int size;

    public MyArrayList() {
        this.arr = new Object[]{};
    }

    public MyArrayList(int capacity) {
        if (capacity > 0) {
            this.arr = new Object[capacity];
        } else if (capacity == 0) {
            this.arr = new Object[]{};
        } else {
            throw new IllegalArgumentException("Illegal Capacity: "+ capacity);
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(T object) {
        if (isEmpty()) {
            size++;
            this.arr = new Object[size];
        } else {
            size++;
            this.arr = Arrays.copyOf(this.arr, size);
        }
        this.arr[size - 1] = object;
    }

    public Object get(int index) {
        return arr[index];
    }

    public void print() {
        System.out.println(Arrays.toString(arr));
    }
}