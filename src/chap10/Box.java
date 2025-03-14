package chap10;
/*
* Gereric Type
* */
public class Box<T> {
    private T object;
//    private E object2;
//    private A object3;
//    private C object4;

    public void set(T object) {
        this.object = object;
    }

    public T get() {
        return object;
    }
}
