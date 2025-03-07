package chap02;

public class StringConvertT {
    public static void main(String[] args) {
//        String str = "12345";
        String str = "!!@@#@##$#^%$^$^$^";

        int intValue = Integer.parseInt(str);
        Integer intergerValue = Integer.valueOf(str);

        System.out.println(intValue);
        System.out.println(intergerValue);
    }
}