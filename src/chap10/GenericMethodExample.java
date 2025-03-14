package chap10;

import chap09.Account;

public class GenericMethodExample {
    public static void main(String[] args) {
        Box<String> result = Util.boxing("문자 하나"); // return type = Box<String>
        System.out.println(result.get());

        Box<Account> result2 = Util.boxing(new Account(10000));

        Box<int[]> boxArray = Util.boxing(new int[3]);
    }
}
