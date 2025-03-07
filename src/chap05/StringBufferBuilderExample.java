package chap05;

public class StringBufferBuilderExample {
    public static void main(String[] args) {
        // Hello Java/Spring DBMS!
        StringBuffer buffer = new StringBuffer();
        buffer.append("Hello ");
        buffer.append("Java/Spring ");
        buffer.append("DBMS");
        System.out.println(buffer);

        // insert
        buffer.insert(0,"Hello!");
        System.out.println(buffer);

        // substring
        System.out.println(buffer.substring(10));
        System.out.println(buffer.substring(10, 13));

        // reverse
        StringBuffer reverse = buffer.reverse();
        System.out.println("reverse result: " + reverse);

    }
}
