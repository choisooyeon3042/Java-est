package chap10.impl;

public class StorageImp<T> implements Storage<T> {
    private T[] array;

    public StorageImp(int capacity) {
        this.array = (T[]) new Object[capacity];
    }

    @Override
    public void add(T t, int index) {
        array[index] = t;
    }

    @Override
    public T get(int index) {
        return array[index];
    }
}
