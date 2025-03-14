package chap10.impl;

public interface Storage<T> {
    void add(T t, int index);
    T get(int index);
}
