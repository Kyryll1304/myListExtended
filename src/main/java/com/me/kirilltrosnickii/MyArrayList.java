package com.me.kirilltrosnickii;

public class MyArrayList implements MyList {
    private String[] array;
    private int size;

    public MyArrayList() {
        this(10); // default capacity
    }

    public MyArrayList(int capacity) {
        array = new String[capacity];
        size = 0;
    }

    public void add(String value) {
        add(value, size);
    }

    public void add(String value, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        if (size == array.length) {
            resize();
        }

        for (int i = size - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }

        array[index] = value;
        size++;
    }

    public void addLast(String value) {
        add(value);
    }

    public String get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        return array[index];
    }

    public String remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        String removed = array[index];

        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        array[size - 1] = null;
        size--;

        return removed;
    }

    public String removeLast() {
        return remove(size - 1);
    }

    public String remove() {
        return remove(0);
    }

    public int size() {
        return size;
    }

    public void printAll() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private void resize() {
        String[] newArray = new String[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public static void main(String[] args) {
        MyList list = new MyArrayList();

        list.add("one");
        list.add("two");
        list.add("three");

        System.out.println("Size: " + list.size());
        System.out.println("Elements:");
        list.printAll();

        System.out.println("Getting element at index 1: " + list.get(1));

        System.out.println("Removing element at index 1: " + list.remove(1));
        System.out.println("Size: " + list.size());
        System.out.println("Elements:");
        list.printAll();

        System.out.println("Removing last element: " + list.removeLast());
        System.out.println("Size: " + list.size());
        System.out.println("Elements:");
        list.printAll();

        list.add("four", 1);
        System.out.println("Size: " + list.size());
        System.out.println("Elements:");
        list.printAll();

        System.out.println("Removing first element: " + list.remove());
        System.out.println("Size: " + list.size());
        System.out.println("Elements:");
        list.printAll();
    }

}
