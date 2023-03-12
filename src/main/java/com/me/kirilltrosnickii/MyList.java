package com.me.kirilltrosnickii;

public interface MyList {
    void add(String value);

    void add(String value, int index);

    void addLast(String value);

    String get(int index);

    String remove(int index);

    String removeLast();

    String remove();

    int size();

    void printAll();
}