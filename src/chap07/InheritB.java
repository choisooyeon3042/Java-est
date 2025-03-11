package chap07;

import chap07.newpack.InheritA;

/*
 * InheritA 상속받은 자식 클래스
 */
public class InheritB extends InheritA {
    int field2;

    void method2() {
        System.out.println("InheritB.method2, field2: " + field2);
    }

    public static void main(String[] args) {
        InheritB inheritB = new InheritB();
        inheritB.field1 = 1;
        inheritB.method1();

        inheritB.field2 = 2;
        inheritB.method2();
    }
}