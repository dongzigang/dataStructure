package com.company;

public class Array {
    private int[] data;
    private int size;
    public Array(int capacity){
        data = new int[capacity];
        size = 0;
    }
    public Array(){
        this(10);
    }
    public int getSize(){
        return size;
    }
    public int get(int index){
        return data[index];
    }
    public int getCapacity(){
        return data.length;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public void addLast(int e) {
        add(size,e);
    }
    public void firstLast(int e) {
        add(0,e);
    }
    public void add(int index, int e) {
        if(size == data.length){
            throw new IllegalArgumentException("error");
        }
        if(index < 0 || index > data.length){
            throw new IllegalArgumentException("error");
        }
        for(int i = size - 1;i >= index;i--){
            data[i+1] = data[i];
        }
        data[index] = e;
        size ++;
    }
}
