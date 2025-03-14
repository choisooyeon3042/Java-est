package chap10;

import chap09.Account;

import java.util.Arrays;

public class ToStringExample2 {
    public static void main(String[] args) {
        Account[] accounts = {new Account(40000),new Account(3000)};
        System.out.println(Arrays.toString(accounts));
    }
}
