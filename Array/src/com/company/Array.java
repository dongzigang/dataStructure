package com.company;

public class Array {
    private int[] data;
    private int size;
    // 构造函数
    public Array(int capacity){
        data = new int[capacity];
        size = 0;
    }
    public Array(){
        this(10);
    }
    // 获取长度
    public int getSize(){
        return size;
    }
    // 获取元素
    public int get(int index){
        return data[index];
    }
    // 获取容量
    public int getCapacity(){
        return data.length;
    }
    // 是否为空
    public boolean isEmpty(){
        return size == 0;
    }
    // 末尾添加元素
    public void addLast(int e) {
        add(size,e);
    }
    // 首位添加元素
    public void firstLast(int e) {
        add(0,e);
    }
    // 添加元素
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
    // 删除元素
    public int del(int index){
        if(index < 0 || index > data.length){
            throw new IllegalArgumentException("error");
        }
        int result = data[index];
        for(int i = index;i < size - 1;i++ ){
            data[i] = data[i + 1];
        }
        size --;
        return result;
    }
    // 是否存在某个元素
    public boolean contains (int e){
       for (int i = 0;i < size; i++){
           if(data[i] == e){
               return true;
           }
       }
       return false;
    }
    public int find (int e){
        for (int i = 0;i < size; i++){
            if(data[i] == e){
                return i;
            }
        }
        return -1;
    }
}
