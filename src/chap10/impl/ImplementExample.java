package chap10.impl;

public class ImplementExample {
    public static void main(String[] args) {
        Storage<String> storage = new StorageImp<>(3);
        storage.add("문자열1", 0);
        storage.add("문자열2", 1);
        storage.add("문자열3", 2);

        System.out.println(storage.get(2));

    }
}
